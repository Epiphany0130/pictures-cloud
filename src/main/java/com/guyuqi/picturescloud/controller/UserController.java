package com.guyuqi.picturescloud.controller;

import com.guyuqi.picturescloud.common.BaseResponse;
import com.guyuqi.picturescloud.common.ResultUtils;
import com.guyuqi.picturescloud.dto.UserRegisterRequest;
import com.guyuqi.picturescloud.exception.ErrorCode;
import com.guyuqi.picturescloud.exception.ThrowUtils;
import com.guyuqi.picturescloud.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 用户注册
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
}
