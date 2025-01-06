package com.example.photoarkbackend.controller;

import com.example.photoarkbackend.common.BaseResponse;
import com.example.photoarkbackend.common.ResultUtils;
import com.example.photoarkbackend.exception.ErrorCode;
import com.example.photoarkbackend.exception.ThrowUtils;
import com.example.photoarkbackend.model.dto.UserLoginRequest;
import com.example.photoarkbackend.model.dto.UserRegisterRequest;
import com.example.photoarkbackend.model.entity.User;
import com.example.photoarkbackend.model.vo.LoginUserVO;
import com.example.photoarkbackend.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: SixAn
 * @Date: 2025-01-06 15:20
 * @Description: 用户 Controller层
 */
@SuppressWarnings({"all"})
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 用户注册
     *
     * @param userRegisterRequest
     * @return BaseResponse<Long>
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        ThrowUtils.throwIf(userRegisterRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }

    /**
     * 用户登录
     *
     * @param userLoginRequest
     * @param request
     * @return BaseResponse<LoginUserVO>
     */
    @PostMapping("/login")
    public BaseResponse<LoginUserVO> userLogin(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request) {
        ThrowUtils.throwIf(userLoginRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userLoginRequest.getUserAccount();
        String userPassword = userLoginRequest.getUserPassword();
        LoginUserVO loginUserVO = userService.userLogin(userAccount, userPassword, request);
        return ResultUtils.success(loginUserVO);
    }

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return BaseResponse<LoginUserVO>
     */
    @GetMapping("/get/login")
    public BaseResponse<LoginUserVO> getLoginUser(HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        return ResultUtils.success(userService.getLoginUserVO(loginUser));
    }

    /**
     * 用户注销
     *
     * @param request
     * @return BaseResponse<Boolean>
     */
    @PostMapping("/logout")
    public BaseResponse<Boolean> userLogout(HttpServletRequest request) {
        ThrowUtils.throwIf(request == null, ErrorCode.PARAMS_ERROR);
        boolean result = userService.userLogout(request);
        return ResultUtils.success(result);
    }
}
