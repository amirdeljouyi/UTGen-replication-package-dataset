package net.sf.xbus.base.core;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import net.sf.xbus.base.core.trace.Trace;

/**
 * <code>TAManager</code> manages transactions.
 * <p>
 * 
 * It implements the <b>Singleton </b> Design-Patterns: An instance of
 * <code>TAManager</code> is created for every thread. This instance can be
 * fetched with <code>getInstance()</code>.
 */
public class TAManager
{

	private static Hashtable mTAManagers = new Hashtable();
	private static final Object classLock = TAManager.class;

	private HashSet mResources;

	/**
	 * The constructor is private, instances of <code>TAManager</code> can
	 * only be generated by the method <code>getInstance()</code>.
	 * <p>
	 * 
	 * Each instance is put in a <code>Hashtable</code> with the name of the
	 * thread as the key.
	 */
	private TAManager()
	{
		mResources = new HashSet();
		mTAManagers.put(Thread.currentThread().getName(), this);
	} // TAManager()

	/**
	 * Delivers an instance of <code>TAManager</code>.
	 * <p>
	 * If it is the first call for the actual thread, a new
	 * <code>TAManager</code> -object will be created. Subsequent calls in
	 * this thread will deliver the object, that has been created by the first
	 * call.
	 * 
	 * @return TAManager - instance of TAManager
	 */
	public static TAManager getInstance()
	{
		synchronized (classLock)
		{
			TAManager taManager = (TAManager) mTAManagers.get(Thread
					.currentThread().getName());

			if (taManager == null)
			{
				taManager = new TAManager();
			} // if (taManager == null)

			return taManager;
		}
	} // getInstance()

	/**
	 * All resources, that should be managed, have to be registered to this
	 * manager. The resource should be open at this point.
	 * 
	 * @param resource Resource of the transaction, that should be managed.
	 */
	public void registerResource(TAResource resource)
	{
		mResources.add(resource);
	}

	/**
	 * Removes a resource from the list of registered resources.
	 * 
	 * @param resource Resource of the transaction, that should be removed.
	 */
	public void removeResource(TAResource resource)
	{
		if (!mResources.remove(resource))
		{
			Trace.info("Resource hasn't been registered.");
		} // if (!mResources.remove(resource))
	} // removeResource(TAResource resource)

	/**
	 * Initializes a transaction. All registered resources will be opened.
	 * 
	 * @throws XException if opening one ressource throws an XException.
	 */
	public void begin() throws XException
	{
		for (Iterator it = mResources.iterator(); it.hasNext();)
		{
			TAResource resource = (TAResource) (it.next());
			resource.open();
		}
	}

	/**
	 * Commits all actions on the registered resources and closes the resources.
	 */
	public void commit()
	{
		HashSet copyRessources = (HashSet) mResources.clone();

		for (Iterator it = copyRessources.iterator(); it.hasNext();)
		{
			TAResource resource = (TAResource) (it.next());
			try
			{
				resource.commit();
			}
			catch (XException e)
			{
				Trace.always("Error during commit !!!");
			}
			// resource.close();
		} // for (Iterator it = copyRessources.iterator(); it.hasNext(); )
	}

	/**
	 * Performs a rollback for all actions on the registered resources and
	 * closes the resources.
	 */
	public void rollback()
	{
		HashSet copyRessources = (HashSet) mResources.clone();

		for (Iterator it = copyRessources.iterator(); it.hasNext();)
		{
			TAResource resource = (TAResource) (it.next());
			try
			{
				resource.rollback();
			}
			catch (XException e)
			{
				Trace.always("Error during rollback !!!");
			}
			// resource.close();
		} // for (Iterator it = copyRessources.iterator(); it.hasNext(); )
	} // rollback()

	/**
	 * Closes all registered resources.
	 */
	public void close()
	{
		HashSet copyRessources = (HashSet) mResources.clone();

		for (Iterator it = copyRessources.iterator(); it.hasNext();)
		{
			TAResource resource = (TAResource) (it.next());
			try
			{
				resource.close();
			}
			catch (XException e)
			{
				Trace.warn(e.getMessage());
			}
		}
	}

	public void clearManager()
	{
		// close();
		mResources.clear();
	}

	static public void clear()
	{
		for (Enumeration e = mTAManagers.keys(); e.hasMoreElements();)
		{
			TAManager mgr = (TAManager) mTAManagers.get(e.nextElement());
			mgr.clearManager();
		}
	}
} // TAManager
