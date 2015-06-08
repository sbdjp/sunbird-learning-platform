package com.ilimi.common.exception;

public enum ResponseCode {

    OK(200), CLIENT_ERROR(400), SERVER_ERROR(500), RESOURCE_NOT_FOUND(404);

    private int code;

    private ResponseCode(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }
}
