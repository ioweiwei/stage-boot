package io.xiaowei.core.sys.sys.controller;

import io.xiaowei.core.sys.sys.model.SysLog;
import io.xiaowei.core.sys.sys.service.ISysLogService;
import io.xiaowei.global.common.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SysLogController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 12:24 上午
 * @Version 1.0
 **/
@RestController
@RequestMapping("/sys/log")
public class SysLogController extends BaseController<SysLog> {

    @Resource
    private ISysLogService sysLogService;

}