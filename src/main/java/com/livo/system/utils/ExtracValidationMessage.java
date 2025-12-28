package com.livo.system.utils;


public final class ExtracValidationMessage {

	private ExtracValidationMessage() {
	}

	public static String extractValidationMessage(Exception e) {
		String message = e.getMessage();
		if (message == null) {
			return "An unknown error occurred.";
		}
		
		// Handle validation failed messages
		int startIndex = message.indexOf("validation failed: ");
		if (startIndex != -1) {
			return message.substring(startIndex + "validation failed: ".length()).trim();
		}
		
		// Handle duplicate entry errors
		if (message.contains("Duplicate entry")) {
			int duplicateIndex = message.indexOf("Duplicate entry '");
			if (duplicateIndex != -1) {
				int endQuote = message.indexOf("'", duplicateIndex + 17);
				if (endQuote != -1) {
					String value = message.substring(duplicateIndex + 17, endQuote);
					return "The value '" + value + "' already exists. Please use a different value.";
				}
			}
			return "A duplicate entry was detected. Please use a unique value.";
		}
		
		// Handle other constraint violations
		if (message.contains("ConstraintViolationException") || message.contains("constraint")) {
			return "Data constraint violation: " + message;
		}
		
		return message;
	}
	
}
