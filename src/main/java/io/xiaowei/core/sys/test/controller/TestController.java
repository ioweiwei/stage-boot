package io.xiaowei.core.sys.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.xiaowei.global.annoation.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/26 11:48 下午
 * @Version 1.0
 **/
@RestController
@RequestMapping("test")
@Api("接口测试")
public class TestController {

    @GetMapping("")
    @ApiOperation("Hello接口")
    @SysLog("测试查询")
    public String test() {
        return "hello";
    }

}
