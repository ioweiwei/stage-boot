package io.xiaowei.core.app.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.xiaowei.core.app.user.service.IUserService;
import io.xiaowei.global.http.HttpResult;
import io.xiaowei.global.http.ResultGenerator;
import io.xiaowei.global.validator.ValidatorUtils;
import io.xiaowei.global.vo.request.app.RegisterForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName AppRegisterController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 10:48 上午
 * @Version 1.0
 **/
@Api("注册")
@RestController
@RequestMapping("/app")
public class AppRegisterController {

    @Resource
    private IUserService userService;

    @PostMapping("register")
    @ApiOperation("注册")
    public HttpResult register(@RequestBody RegisterForm form) {
        //表单校验
        ValidatorUtils.validateEntity(form);
        userService.register(form);
        return ResultGenerator.genSuccessResult();
    }

}
