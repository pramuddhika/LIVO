package com.livo.system.utils;

public class ApiResponse<T> {

	private int code;
	private String status;
	private String message;
	private T data;

	public ApiResponse(int code, String status, String message , T data) {
		this.code = code;
		this.status = status;
		this.message = message;
		this.data = data;
	}
	
	
	public int getCode() {
		return code;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public T getData() {
		return data;
	}



	public static <T> ApiResponse<T> success(String message, T data) {
        return new ApiResponse<>(200, "S", message, data);
    }
	
	public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>(200, "E", message, null);
    }
	
	public static <T> ApiResponse<T> failure(String message, T data) {
		return new ApiResponse<>(500, "F", message, data);
	}
	

}
