package com.doutown.jwt;

public class ApiResponse {

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    private boolean success;
    private String message;

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

}
