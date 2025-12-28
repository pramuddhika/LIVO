package com.livo.system.utils;

public final class ExtracValidationMessage {

	private ExtracValidationMessage() {
	}

	public static String extractValidationMessage(Exception e) {
		String message = e.getMessage();
		if (message == null || message.isEmpty()) {
			return "An unknown error occurred.";
		}

		// Handle validation failed messages
		if (message.contains("validation failed: ")) {
			int startIndex = message.indexOf("validation failed: ") + 19;
			return message.substring(startIndex);
		}

		// Handle duplicate entry errors
		if (message.contains("Duplicate entry")) {
			int startIndex1 = message.indexOf("Duplicate entry '") + 17;
			int endIndex = message.indexOf("'", startIndex1);
			if (startIndex1 > 16 && endIndex > startIndex1) {
				String duplicateValue = message.substring(startIndex1, endIndex);
				return "The value '" + duplicateValue + "' already exists. Please use a different value.";
			}
		}

		// Handle constraint violations with interpolatedMessage
		if (message.contains("interpolatedMessage='")) {
			int startIndex = message.indexOf("interpolatedMessage='") + 21;
			int endIndex = message.indexOf("'", startIndex);
			if (endIndex > startIndex) {
				return message.substring(startIndex, endIndex);
			}
		}

		// Handle other constraint violations
		if (message.contains("constraint violation")) {
			return "Data validation failed. Please check your input.";
		}

		return message;
	}

}
