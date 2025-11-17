package com.guyuqi.picturescloud.service;

import com.guyuqi.picturescloud.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author GuYuqi
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-11-16 19:40:44
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 密码加密
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);
}
