package io.xiaowei.core.app.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.xiaowei.core.app.user.model.User;
import io.xiaowei.core.app.user.service.IUserService;
import io.xiaowei.global.http.HttpResult;
import io.xiaowei.global.http.ResultGenerator;
import io.xiaowei.global.utils.JwtUtils;
import io.xiaowei.global.validator.ValidatorUtils;
import io.xiaowei.global.vo.request.app.LoginForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AppLoginController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 10:26 上午
 * @Version 1.0
 **/
@Api("登录")
@RestController
@RequestMapping("/app")
public class AppLoginController {

    @Resource
    private JwtUtils jwtUtils;

    @Resource
    private IUserService userService;

    @PostMapping("login")
    @ApiOperation("登录")
    public HttpResult login(@RequestBody LoginForm form) {
        //表单校验
        ValidatorUtils.validateEntity(form);

        //用户登录
        User user = userService.login(form);

        //生成token
        String token = jwtUtils.generateToken(user.getId());

        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("expire", jwtUtils.getExpire());
        return ResultGenerator.genSuccessResult(map);
    }

}
