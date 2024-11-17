package com.jdfcc.accountmanage.eneity;

public class Result {
    private String message;
    private Object data;

    public Result(String message, Object data) {
    }

    public static Result success(Object data) {
        return new Result("success", data);
    }

    public static Result error(String message) {
        return new Result(message, null);
    }

    public static Result success() {
        return new Result("success", null);
    }
}
