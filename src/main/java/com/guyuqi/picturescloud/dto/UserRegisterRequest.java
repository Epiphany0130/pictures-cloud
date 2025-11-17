package com.guyuqi.picturescloud.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author GuYuqi
 * @version 1.0
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 420679011124364875L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 确认密码
     */
    private String checkPassword;
}
