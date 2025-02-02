/*******************************************************************************
 * Copyright (c) 2013 J. Craig Venter Institute.
 * 	This file is part of Jillion
 * 
 * 	 Jillion is free software: you can redistribute it and/or modify
 * 	it under the terms of the GNU General Public License as published by
 * 	the Free Software Foundation, either version 3 of the License, or
 * 	(at your option) any later version.
 * 	
 * 	 Jillion is distributed in the hope that it will be useful,
 * 	but WITHOUT ANY WARRANTY; without even the implied warranty of
 * 	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * 	GNU General Public License for more details.
 * 	
 * 	You should have received a copy of the GNU General Public License
 * 	along with  Jillion.  If not, see http://www.gnu.org/licenses
 * 
 * Contributors:
 *     Danny Katzel - initial API and implementation
 ******************************************************************************/
package org.jcvi.jillion.assembly.tigr.tasm;

import java.io.File;
import java.io.IOException;

import org.jcvi.jillion.core.datastore.DataStore;
import org.jcvi.jillion.core.datastore.DataStoreFilter;
import org.jcvi.jillion.core.util.iter.StreamingIterator;
import org.jcvi.jillion.internal.core.util.iter.AbstractBlockingStreamingIterator;

final class TasmContigFileContigIterator extends AbstractBlockingStreamingIterator<TasmContig>{

	private final File contigFile;
	private final DataStoreFilter filter;
	private final DataStore<Long> fullLengthSequences;
	
	public static StreamingIterator<TasmContig> create(File contigFile, DataStore<Long> fullLengthSequences, DataStoreFilter filter){
		TasmContigFileContigIterator iter = new TasmContigFileContigIterator(contigFile,fullLengthSequences,filter);
		iter.start();
		return iter;
	}
	
	private TasmContigFileContigIterator(File contigFile, DataStore<Long> fullLengthSequences, DataStoreFilter filter) {
		this.contigFile = contigFile;
		this.filter = filter;
		this.fullLengthSequences = fullLengthSequences;
	}



	@Override
	protected void backgroundThreadRunMethod() throws RuntimeException {
		TasmFileVisitor visitor = new TasmFileVisitor() {
			
			@Override
			public void halted() {
				//no-op				
			}
			
			@Override
			public void visitEnd() {
				//no-op				
			}
			
			@Override
			public TasmContigVisitor visitContig(TasmContigVisitorCallback callback,
					String contigId) {
				if(filter.accept(contigId)){
					return new AbstractTasmContigBuilderVisitor(contigId, fullLengthSequences) {
						
						@Override
						protected void visitRecord(TasmContigBuilder contig) {
							blockingPut(contig);
							
						}
					};
				}
				return null;
			}
		};
		
		try {
			TasmFileParser.create(contigFile).accept(visitor);
		} catch (IOException e) {
			throw new RuntimeException("error parsing contig file",e);
		}
	}

	
}
