package com.livo.system.utils;


public final class ExtracValidationMessage {

	private ExtracValidationMessage() {
	}

	public static String extractValidationMessage(Exception e) {
		String message = e.getMessage();
		if (message == null) {
			return "An unknown error occurred.";
		}
		int startIndex = message.indexOf("validation failed: ");
		if (startIndex != -1) {
			return message.substring(startIndex + "validation failed: ".length()).trim();
		}
		return message;
	}
	
}
