package com.example.photoarkbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.photoarkbackend.model.entity.User;
import com.example.photoarkbackend.model.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户 Service 层
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取加密后的密码
     *
     * @param userPassword 用户密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取脱敏后的登录用户信息
     *
     * @param user 脱敏前的用户数据
     * @return 脱敏后的用户数据
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取当前登录用户
     *
     * @param request HTTP 请求
     * @return 当前登录用户
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request HTTP 请求
     * @return boolean
     */
    boolean userLogout(HttpServletRequest request);
}
