package com.example.photoarkbackend.common;

import com.example.photoarkbackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: SixAn
 * @Date: 2025-01-05 16:40
 * @Description: 通用返回类
 */
@SuppressWarnings({"all"})
@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private T data;
    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

