package com.example.photoarkbackend.controller;

import com.example.photoarkbackend.common.BaseResponse;
import com.example.photoarkbackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SixAn
 * @Date: 2025-01-05 16:42
 * @Description: 健康检查接口
 */
@SuppressWarnings({"all"})
@RestController
@RequestMapping("/")
public class MainController {
    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
