/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2009 Joern Huxhorn
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.huxhorn.lilith.data.logging;

import java.io.Serializable;
import java.util.Arrays;

public class ThrowableInfo
	implements Serializable
{
	private static final long serialVersionUID = -6320441996003349426L;

	private String name;
	private String message;
	private ThrowableInfo cause;
	private ExtendedStackTraceElement[] stackTrace;
	private int omittedElements;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public ExtendedStackTraceElement[] getStackTrace()
	{
		return stackTrace;
	}

	public void setStackTrace(ExtendedStackTraceElement[] stackTrace)
	{
		this.stackTrace = stackTrace;
	}

	public ThrowableInfo getCause()
	{
		return cause;
	}

	public void setCause(ThrowableInfo cause)
	{
		this.cause = cause;
	}

	public int getOmittedElements()
	{
		return omittedElements;
	}

	public void setOmittedElements(int omittedElements)
	{
		this.omittedElements = omittedElements;
	}

	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;

		final ThrowableInfo that = (ThrowableInfo) o;
		if(omittedElements != that.omittedElements) return false;
		if(name != null ? !name.equals(that.name) : that.name != null) return false;
		if(message != null ? !message.equals(that.message) : that.message != null) return false;
		if(!Arrays.equals(stackTrace, that.stackTrace)) return false;
		return !(cause != null ? !cause.equals(that.cause) : that.cause != null);
	}

	public int hashCode()
	{
		int result = omittedElements;
		result = 29 * result + (name != null ? name.hashCode() : 0);
		result = 29 * result + (message != null ? message.hashCode() : 0);
		result = 29 * result + (cause != null ? cause.hashCode() : 0);
		return result;
	}

	@Override
	public String toString()
	{
		return toString(false);
	}
	public String toString(boolean verbose)
	{
		StringBuilder result=new StringBuilder();
		result.append("ThrowableInfo[");
		result.append("name=").append(name);
		if(message != null)
		{
			result.append(", message=\"").append(message).append("\"");
		}
		if(stackTrace != null)
		{
			if(verbose)
			{
				result.append(", stackTrace=").append(Arrays.toString(stackTrace));
			}
			else
			{
				result.append(", stackTrace.length=").append(stackTrace.length);
			}
		}
		if(omittedElements>0)
		{
			result.append(", omittedElements=").append(omittedElements);
		}
		if(cause!=null)
		{
			result.append(", cause=").append(cause.toString(verbose));
		}

		result.append("]");
		return result.toString();
	}
}
