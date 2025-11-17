package com.guyuqi.picturescloud.controller;

import com.guyuqi.picturescloud.common.BaseResponse;
import com.guyuqi.picturescloud.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("success");
    }
}
