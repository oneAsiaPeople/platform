package com.francis.platform.common.response;

/**
 * @author Francis
 */

public enum CommonCode implements ResultCode {

    SUCCESS(true, 200, "操作成功"),
    ERROR(false, -1, "business error"),
    CUSTOM_EXCEPTION(false, -2, "CUSTOM_EXCEPTION"),
    UNAUTHORIZED_ERROR(false, 400, "未认证"),
    USERNAME_AND_PASSWORD_ERROR(false, 401, "用户名或密码不正确！"),
    PERMISSION_DENIED(false, 402, "权限不足！"),

    LOGIN_ELSE_WHERE(false, 403, "您的账号在其他地方登录！"),

    ;


    boolean success;
    int code;
    String message;
    CommonCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
