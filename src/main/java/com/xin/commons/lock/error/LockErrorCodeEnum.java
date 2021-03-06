package com.xin.commons.lock.error;

import com.xin.commons.support.code.ErrorCode;

/**
 * 业务错误码
 * @author: xin
 */
public enum LockErrorCodeEnum implements ErrorCode {


    TRY_LOCK_ERROR(1050, "加锁失败");

    private final int code;
    private final String message;

    LockErrorCodeEnum(final int code, final String message) {

        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {

        return this.code;
    }

    @Override
    public String getMessage() {

        return this.message;
    }

}
