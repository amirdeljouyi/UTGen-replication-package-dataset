/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2009 Joern Huxhorn
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.huxhorn.lilith.engine.impl.eventproducer;

import de.huxhorn.lilith.data.access.AccessEvent;
import de.huxhorn.lilith.data.access.protobuf.AccessEventProtobufDecoder;
import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.data.eventsource.SourceIdentifier;
import de.huxhorn.sulky.buffers.AppendOperation;
import de.huxhorn.sulky.codec.Decoder;

import java.io.InputStream;

public class AccessEventProtobufMessageBasedEventProducer
	extends AbstractMessageBasedEventProducer<AccessEvent>
{
	public AccessEventProtobufMessageBasedEventProducer(SourceIdentifier sourceIdentifier, AppendOperation<EventWrapper<AccessEvent>> eventQueue, InputStream inputStream, boolean compressing)
	{
		super(sourceIdentifier, eventQueue, inputStream, compressing);
	}

	protected Decoder<AccessEvent> createDecoder()
	{
		return new AccessEventProtobufDecoder(isCompressing());
	}
}
