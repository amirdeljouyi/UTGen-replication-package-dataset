package macaw.businessLayer;

import macaw.system.*;

import java.util.ArrayList;




/**
 * describes which kinds of users can access a variable
 * <hr>
 * Copyright 2010 Medical Research Council Unit for Lifelong Health and Ageing
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  
 * <hr>
 * @author Kevin Garwood (kgarwood@users.sourceforge.net)
 * @version 1.0	
 */

/*
 * Code Road Map:
 * --------------
 * Code is organised into the following sections.  Wherever possible, 
 * methods are classified based on an order of precedence described in 
 * parentheses (..).  For example, if you're trying to find a method 
 * 'getName(...)' that is both an interface method and an accessor 
 * method, the order tells you it should appear under interface.
 * 
 * Order of 
 * Precedence     Section
 * ==========     ======
 * (1)            Section Constants
 * (2)            Section Properties
 * (3)            Section Construction
 * (7)            Section Accessors and Mutators
 * (6)            Section Errors and Validation
 * (5)            Section Interfaces
 * (4)            Section Overload
 *
 */

public class AvailabilityState extends MacawListChoice {


	// ==========================================
	// Section Constants
	// ==========================================

	// ==========================================
	// Section Properties
	// ==========================================
	
	// ==========================================
	// Section Construction
	// ==========================================

	public AvailabilityState(int identifier, String status) {
		super(identifier, status);
	}
	
	public AvailabilityState(String status) {
		super(status);
	}

	
	public AvailabilityState() {
		super();
	}
	
	// ==========================================
	// Section Accessors and Mutators
	// ==========================================
	
	static public ArrayList<MacawChangeEvent> detectFieldChanges(User user,
			 												 	 AvailabilityState originalAvailabilityState,
			 												 	 AvailabilityState revisedAvailabilityState) { 

		return MacawListChoice.detectFieldChanges(user,
												  "availabilityState.saveChanges.changedValue",
												  originalAvailabilityState,
												  revisedAvailabilityState);
	}

	// ==========================================
	// Section Errors and Validation
	// ==========================================

	static public void validateFields(AvailabilityState availabilityState) throws MacawException {
		ArrayList<String> errorMessages 
			= MacawListChoice.validateFields(availabilityState);
		if (errorMessages.size() > 0) {
			MacawException exception 
				= new MacawException();
			for (String errorMessage : errorMessages) {
				exception.addErrorMessage(MacawErrorType.INVALID_AVAILABILITY_STATE, 
										  errorMessage);
			}
			throw exception;
		}
	}
		
	// ==========================================
	// Section Interfaces
	// ==========================================
		
	// ==========================================
	// Section Overload
	// ==========================================
	public Object clone() {
		AvailabilityState cloneAvailabilityStatus
			= new AvailabilityState();
		super.cloneAttributes(cloneAvailabilityStatus);
		
		return cloneAvailabilityStatus;
	}
	
}

