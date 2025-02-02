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

public class ThreadInfo
	implements Serializable, Cloneable
{
	private static final long serialVersionUID = -6595917506249294471L;

	private Long id;
	private String name;
	private Long groupId;
	private String groupName;

	public ThreadInfo()
	{
		this(null, null, null, null);
	}

	public ThreadInfo(Long id, String name, Long groupId, String groupName)
	{
		this.id = id;
		this.name = name;
		this.groupId = groupId;
		this.groupName = groupName;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getGroupId()
	{
		return groupId;
	}

	public void setGroupId(Long groupId)
	{
		this.groupId = groupId;
	}

	public String getGroupName()
	{
		return groupName;
	}

	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;

		ThreadInfo that = (ThreadInfo) o;

		if(id != null ? !id.equals(that.id) : that.id != null) return false;
		if(groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
		if(groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
		if(name != null ? !name.equals(that.name) : that.name != null) return false;

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
		result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
		return result;
	}

	@Override
	public ThreadInfo clone()
		throws CloneNotSupportedException
	{
		return (ThreadInfo) super.clone();
	}

	@Override
	public String toString()
	{
		return "ThreadInfo[id=" + id + ", name=" + name + ", groupId="+groupId+", groupName="+groupName+"]";
	}
}
