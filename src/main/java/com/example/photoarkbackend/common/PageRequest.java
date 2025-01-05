package com.example.photoarkbackend.common;

import lombok.Data;

/**
 * @Author: SixAn
 * @Date: 2025-01-05 16:41
 * @Description:
 */
@SuppressWarnings({"all"})
@Data
public class PageRequest {
    /**
     * 当前页号
     */
    private int current = 1;
    /**
     * 页面大小
     */
    private int pageSize = 10;
    /**
     * 排序字段
     */
    private String sortField;
    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}
