package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {

    // 通过用户id获取用户对象的方法
    UserModel getUserById(Integer id);

    // 用户注册
    void register(UserModel userModel) throws BusinessException;

    /*
    telephone: 用户注册手机号码
    password: 用户加密后的密码
     */
    // 用户登录
    UserModel validateLogin(String telephone, String encryptPassword) throws BusinessException;
}