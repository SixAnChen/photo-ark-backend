package com.example.photoarkbackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: SixAn
 * @Date: 2025-01-05 16:42
 * @Description:
 */
@SuppressWarnings({"all"})
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;
    private static final long serialVersionUID = 1L;
}
