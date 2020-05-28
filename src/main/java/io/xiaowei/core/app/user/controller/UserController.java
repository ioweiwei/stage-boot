package io.xiaowei.core.app.user.controller;

import io.swagger.annotations.ApiOperation;
import io.xiaowei.core.app.user.service.IUserService;
import io.xiaowei.global.annoation.Login;
import io.xiaowei.global.http.HttpResult;
import io.xiaowei.global.http.ResultGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 11:13 上午
 * @Version 1.0
 **/
@RestController
@RequestMapping("/app")
public class UserController {

    @Resource
    private IUserService userService;

    @Login
    @ApiOperation("用户信息")
    @GetMapping("/user/info/{id}")
    public HttpResult userInfo(@PathVariable("id") Long id) {
        try {
            return ResultGenerator.genSuccessResult(userService.findById(id));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

}
