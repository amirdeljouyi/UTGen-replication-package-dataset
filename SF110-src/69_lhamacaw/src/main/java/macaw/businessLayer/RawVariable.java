package macaw.businessLayer;

import macaw.system.*;

import java.util.ArrayList;

/**
 * a Variable that relates to a particular question on a particular 
 * form of a particular survey that forms part of the NSHD�s ongoing study.
 * The majority of RawVariables are found on paper-based index cards, 
 * some of which are decades old.
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

public class RawVariable extends Variable {

	// ==========================================
	// Section Constants
	// ==========================================

	// ==========================================
	// Section Properties
	// ==========================================
	
	
	// ==========================================
	// Section Construction
	// ==========================================
	public RawVariable() {
		super();
	}
	
	// ==========================================
	// Section Accessors and Mutators
	// ==========================================



	static public ArrayList<MacawChangeEvent> detectFieldChanges(User user,
			 													 RawVariable originalRawVariable,
			 													 RawVariable revisedRawVariable) {
		
				
		ArrayList<MacawChangeEvent> changeEvents 
			= Variable.detectFieldChanges(user, 
										  originalRawVariable, 
										  revisedRawVariable);
		return changeEvents;
	}

	public boolean hasSameDisplayName(Variable variable) {
		if ((getName().equals(variable.getName()) == true) &&
			(variable instanceof RawVariable == true)) {
			return true;
		}
		return false;
	}

	// ==========================================
	// Section Errors and Validation
	// ==========================================

	public static void validateFields(RawVariable rawVariable) throws MacawException {

		ArrayList<String> errorMessages
			= Variable.validateFields(rawVariable);

		/**
		if (ValidationUtility.isBlank(rawVariable.getForm()) == true) {
			String formText
				= MacawMessages.getMessage("rawVariable.form.label");
			String errorMessage
				= MacawMessages.getMessage("general.error.blankField",
										   formText);
			errorMessages.add(errorMessage);
		}
		if (ValidationUtility.isBlank(rawVariable.getQuestionNumber()) == true) {
			String questionNumberText
				= MacawMessages.getMessage("rawVariable.questionNumber.label");
			String errorMessage
				= MacawMessages.getMessage("general.error.blankField",
										   questionNumberText);
			errorMessages.add(errorMessage);
		}		
		 */
		if (errorMessages.size() > 0) {
			MacawException exception
				= new MacawException();
			for (String errorMessage : errorMessages) {
				exception.addErrorMessage(MacawErrorType.INVALID_RAW_VARIABLE, 
										  errorMessage);
			}
			throw exception;
		}
	}
	
	// ==========================================
	// Section Interfaces
	// ==========================================
	
	//Interface: Clonable
	public Object clone() {
		RawVariable cloneVariable = new RawVariable();
		super.cloneAttributes(cloneVariable);		
		return cloneVariable;
	}
	

	
	// ==========================================
	// Section Overload
	// ==========================================

}

