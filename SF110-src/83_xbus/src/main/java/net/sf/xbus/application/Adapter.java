package net.sf.xbus.application;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.core.Constants;
import net.sf.xbus.base.core.XException;
import net.sf.xbus.base.core.config.Configuration;
import net.sf.xbus.base.core.trace.Trace;
import net.sf.xbus.base.deletedMessageStore.DeletedMessageStore;
import net.sf.xbus.base.journal.Journal;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.Message;
import net.sf.xbus.protocol.MessageFactory;
import net.sf.xbus.protocol.ObjectMessage;
import net.sf.xbus.protocol.TextMessage;
import net.sf.xbus.protocol.XMLMessage;
import net.sf.xbus.protocol.simple.SimpleTextMessage;
import net.sf.xbus.technical.ObjectSender;
import net.sf.xbus.technical.Sender;
import net.sf.xbus.technical.SenderFactory;
import net.sf.xbus.technical.TextSender;

import org.w3c.dom.Document;

/**
 * The <code>Adapter</code> is called from receivers. He is responsible for
 * creating the appropriate <code>Message</code> object, calling the
 * appropriate object and method of the application layer and logging the call
 * in the <code>DBJournal</code>.
 */
public class Adapter
{
	private String mReturncode = Constants.RC_NOK;

	private Object mResponse = null;
	private String mErrormessage = null;

	/**
	 * Sends a message to a sender (which was generated by the
	 * {@link net.sf.xbus.technical.SenderFactory}).
	 * <p>
	 * 
	 * @param message the message to be sent
	 * @param destination the destination where the message shall be sent to
	 * @throws XException if something goes wrong
	 */
	static public void callSender(Message message, XBUSSystem destination)
			throws XException
	{
		try
		{
			Sender sender = SenderFactory.createSender(destination);

			String senderType = Configuration.getInstance().getValueOptional(
					"System", destination.getName(), "Type");
			if (senderType == null)
			{
				senderType = sender.getType();
			}

			if (Constants.TYPE_TEXT.equals(senderType))
			{
				boolean sendMessage = true;
				String request = ((TextMessage) message)
						.getRequestText(destination);
				if (isEmpty(request))
				{
					String onEmpty = retrieveOnEmpty(destination.getName(),
							true);
					if (onEmpty.equals(Constants.READ_IGNORE))
					{
						sendMessage = false;
					}
					else if (onEmpty.equals(Constants.READ_PROCESS))
					{
						sendMessage = true;
					}
					else if (onEmpty.equals(Constants.READ_ERROR))
					{
						throw new XException(Constants.LOCATION_EXTERN,
								Constants.LAYER_APPLICATION,
								Constants.PACKAGE_APPLICATION_ADAPTER, "4");
					}
				}

				if (sendMessage)
				{
					// Send the message to the destination system
					// The message is already transformed and must only be
					// retrieved.
					// Structure information for message serialisation is due to
					// the
					// destination system.
					TextSender textsender = (TextSender) sender;

					String resData = textsender.execute(message.getFunction(),
							request);

					((TextMessage) message).setResponseText(resData,
							destination);
					message.setResponseTimestamp(new Date());
				}
			}
			else if (Constants.TYPE_OBJECT.equals(senderType))
			{
				boolean sendMessage = true;
				Object request = ((ObjectMessage) message)
						.getRequestObject(destination);
				if (isEmpty(request))
				{
					String onEmpty = retrieveOnEmpty(destination.getName(),
							true);
					if (onEmpty.equals(Constants.READ_IGNORE))
					{
						sendMessage = false;
					}
					else if (onEmpty.equals(Constants.READ_PROCESS))
					{
						sendMessage = true;
					}
					else if (onEmpty.equals(Constants.READ_ERROR))
					{
						throw new XException(Constants.LOCATION_EXTERN,
								Constants.LAYER_APPLICATION,
								Constants.PACKAGE_APPLICATION_ADAPTER, "4");
					}
				}

				if (sendMessage)
				{
					// Send the message to the destination system
					// The message is already transformed and must only be
					// retrieved.
					// Structure information for message serialisation is due to
					// the
					// destination system.
					ObjectSender objectsender = (ObjectSender) sender;

					Object resData = objectsender.execute(
							message.getFunction(), ((ObjectMessage) message)
									.getRequestObject(destination));

					((ObjectMessage) message).setResponseObject(resData,
							destination);
					message.setResponseTimestamp(new Date());
				}
			}
			else if (Constants.TYPE_XML.equals(senderType))
			{
				boolean sendMessage = true;
				Object request = ((ObjectMessage) message)
						.getRequestObject(destination);
				if (isEmpty(request))
				{
					String onEmpty = retrieveOnEmpty(destination.getName(),
							true);
					if (onEmpty.equals(Constants.READ_IGNORE))
					{
						sendMessage = false;
					}
					else if (onEmpty.equals(Constants.READ_PROCESS))
					{
						sendMessage = true;
					}
					else if (onEmpty.equals(Constants.READ_ERROR))
					{
						throw new XException(Constants.LOCATION_EXTERN,
								Constants.LAYER_APPLICATION,
								Constants.PACKAGE_APPLICATION_ADAPTER, "4");
					}
				}

				if (sendMessage)
				{
					// Send the message to the destination system
					// The message is already transformed and must only be
					// retrieved.
					ObjectSender objectsender = (ObjectSender) sender;

					Document resData = (Document) objectsender.execute(message
							.getFunction(), ((XMLMessage) message)
							.getRequestDocument(destination));

					((XMLMessage) message).setResponseDocument(resData,
							destination);
					message.setResponseTimestamp(new Date());
				}
			}
			else
			{
				List params = new Vector();
				params.add(sender.getType());
				throw new XException(Constants.LOCATION_INTERN,
						Constants.LAYER_APPLICATION,
						Constants.PACKAGE_APPLICATION_ADAPTER, "1", params);
			}
		}
		catch (Exception t)
		{
			message.setResponseTimestamp(new Date());
			message.setReturncode(Constants.RC_NOK);
			message.setErrortext(t.getMessage());
			Trace.error(t);
		}

		/* Logging of the sending-activity into the journal. */
		try
		{
			new Journal().log('S', destination, message);
		}
		catch (Exception t)
		{
			throw new XException(Constants.LOCATION_INTERN,
					Constants.LAYER_APPLICATION,
					Constants.PACKAGE_APPLICATION_ADAPTER, "0", t);
		}
	}

	/**
	 * Creates the appropriate <code>Message</code> object by calling the
	 * <code>MessageFactory</code> and calls the appropriate object and method
	 * of the application layer by calling the <code>ApplicationFactory</code>.
	 * Finally the <code>DBJournal</code> class is called for logging of the
	 * call.
	 * <p>
	 * The resulting returncode and response-string can be requested afterwards
	 * with dedicated methods in this class.
	 */
	public void callApplication(XBUSSystem source, Object request,
			String messageType)
	{
		/*
		 * Setting values for the DeletedMessageStore
		 */
		DeletedMessageStore dms = DeletedMessageStore.getInstance();
		dms.setMessage(request);
		dms.setSystem(source);

		mReturncode = Constants.RC_NOK;
		Message call = null;
		try
		{
			try
			{
				// Zero: check handling of empty messages
				if (!checkRequest(source, request))
				{
					/*
					 * Request shall not be processed but ignored
					 */
					call = new SimpleTextMessage(source);
					try
					{
						((TextMessage) call).setRequestText(request.toString(),
								source);
					}
					catch (XException e)
					{
						// This problem has already been traced
					}
					call.setReturncode(Constants.RC_OK);
				}
				else
				{
					/*
					 * Request shall be processed
					 */

					// First: create the message obejct
					call = MessageFactory.createApplicationMessage(source);

					// Second: initialise the message object by pasting in the
					// request
					// as content,
					// then perfom the call the appropriate application object
					// and record the response
					if (Constants.TYPE_TEXT.equals(messageType))
					{
						((TextMessage) call).setRequestText((String) request,
								source);
						ApplicationFactory.callApplication(call);
						// Get the response.
						// The message is already transformed and structure
						// information
						// for serialising is attached to the source system.
						mResponse = ((TextMessage) call).getResponseText();
					}
					else if (Constants.TYPE_OBJECT.equals(messageType))
					{
						((ObjectMessage) call)
								.setRequestObject(request, source);
						ApplicationFactory.callApplication(call);
						// Get the response.
						// The message is already transformed and structure
						// information
						// for serialising is attached to the source system.
						mResponse = ((ObjectMessage) call).getResponseObject();
					}
				}
			}
			catch (Exception t)
			{
				/*
				 * Inner try-catch block catches all exceptions and converts
				 * them to XExceptions if necessary
				 */
				if (t instanceof XException)
				{
					throw (XException) t;
				}
				else
				{
					throw new XException(Constants.LOCATION_INTERN,
							Constants.LAYER_APPLICATION,
							Constants.PACKAGE_APPLICATION_ADAPTER, "0", t);
				}
			}
		}
		catch (XException e)
		{
			/*
			 * Outer try-catch block handles the XException
			 */
			if (call == null)
			{
				if (request == null)
				{
					request = "<null>";
				}
				call = new SimpleTextMessage(source);
				try
				{
					((TextMessage) call).setRequestText(request.toString(),
							source);
				}
				catch (XException e1)
				{
					// This problem has already been traced
				}
			}
			call.setReturncode(Constants.RC_NOK);
			if ((call.getErrortext() == null)
					|| (call.getErrortext().length() == 0))
			{
				call.setErrortext(e.getMessage());
			}
		}
		finally
		{
			mReturncode = call.getReturncode();
			mErrormessage = call.getErrortext();

			try
			{
				// Logging of the receiving-activity into the journal and
				// closing the
				// connection to the database.
				call.setResponseTimestamp(new Date());
				Journal journal = new Journal();
				journal.log('R', source, call);
				journal.commit();
			} // try
			catch (Exception t)
			{
				Trace.error(t);
			} // catch (Throwable t)
		}
	} // callApplication(XBUSSystem source, String request)

	/**
	 * 
	 * @return
	 */
	private boolean checkRequest(XBUSSystem source, Object request)
			throws XException
	{
		boolean result = true;

		/*
		 * Request == null will never be processed
		 */
		// if (request == null)
		// {
		// throw new XException(Constants.LOCATION_EXTERN,
		// Constants.LAYER_APPLICATION,
		// Constants.PACKAGE_APPLICATION_ADAPTER, "2");
		// }
		/*
		 * Check if empty requests shall be processed
		 */
		if (isEmpty(request))
		{
			String onEmpty = retrieveOnEmpty(source.getName(), false);
			if (onEmpty.equals(Constants.READ_ERROR))
			{
				throw new XException(Constants.LOCATION_EXTERN,
						Constants.LAYER_APPLICATION,
						Constants.PACKAGE_APPLICATION_ADAPTER, "4");
			}
			else if (onEmpty.equals(Constants.READ_IGNORE))
			{
				result = false;
			}
		}

		return result;
	}

	private static boolean isEmpty(Object request)
	{
		if (request == null)
		{
			return true;
		}

		if ((request instanceof String) && (((String) request).length() == 0))
		{
			return true;
		}
		if ((request instanceof ByteArrayList)
				&& (((ByteArrayList) request).length() == 0))
		{
			return true;
		}
		return false;

	}

	/**
	 * Reads the action which should happen with the file is empty for the for
	 * the given system name from the standard configuration and checks its
	 * conformity with the allowed ones:
	 * <p>
	 * <dl>
	 * <dd><code>Error</code> &nbsp;-throw a XException
	 * <dd><code>Ignore</code> &nbsp;&nbsp;&nbsp;- ignore the request
	 * <dd><code>Process</code> &nbsp;&nbsp;&nbsp;- process normally
	 * </dl>
	 */
	static private String retrieveOnEmpty(String system, boolean sender)
			throws XException
	{
		String onEmpty = Configuration.getInstance().getValueOptional(
				Constants.CHAPTER_SYSTEM, system, "OnEmpty");
		if (onEmpty == null)
		{
			if (sender)
			{
				onEmpty = Constants.READ_PROCESS;
			}
			else
			{
				onEmpty = Constants.READ_IGNORE;
			}
		}
		if (!onEmpty.equals(Constants.READ_ERROR)
				&& !onEmpty.equals(Constants.READ_IGNORE)
				&& !onEmpty.equals(Constants.READ_PROCESS))
		{
			List params = new Vector();
			params.add(onEmpty);
			throw new XException(Constants.LOCATION_INTERN,
					Constants.LAYER_APPLICATION,
					Constants.PACKAGE_APPLICATION_ADAPTER, "3", params);
		}
		return onEmpty;
	}

	/**
	 * After calling the application layer, the receiver can query the resulting
	 * returncode.
	 */
	public String getReturncode()
	{
		return mReturncode;
	}

	/**
	 * After calling the application layer, the receiver can query the resulting
	 * response.
	 */
	public Object getResponse()
	{
		return mResponse;
	}

	/**
	 * After calling the application layer, the receiver can query the resulting
	 * error message.
	 */
	public String getErrormessage()
	{
		return mErrormessage;
	}
}
