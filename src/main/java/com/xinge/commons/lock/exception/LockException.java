package com.xinge.commons.lock.exception;

import com.xinge.commons.lock.error.LockErrorCodeEnum;
import com.xinge.comons.support.exception.BizException;
import lombok.Getter;

/**
 * 业务层异常类
 * @author: xinge
 */
@Getter
public class LockException extends BizException {

    private int code;

    public LockException() {
        super();
    }

    public LockException(final LockErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
    }

    public LockException(final LockErrorCodeEnum errorCodeEnum, final Throwable cause) {
        super(errorCodeEnum.getMessage(), cause);
    }
}
