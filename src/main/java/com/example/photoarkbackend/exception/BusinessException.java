package com.example.photoarkbackend.exception;

import lombok.Getter;

/**
 * @Author: SixAn
 * @Date: 2025-01-05 16:39
 * @Description:
 */
@SuppressWarnings({"all"})
@Getter
public class BusinessException extends RuntimeException {
    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}
