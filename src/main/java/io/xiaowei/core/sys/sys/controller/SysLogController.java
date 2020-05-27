package io.xiaowei.core.sys.sys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.xiaowei.core.sys.sys.model.SysLog;
import io.xiaowei.core.sys.sys.service.ISysLogService;
import io.xiaowei.global.common.BaseController;
import io.xiaowei.global.common.IBaseController;
import io.xiaowei.global.common.request.PageRequest;
import io.xiaowei.global.http.HttpResult;
import io.xiaowei.global.http.ResultGenerator;
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
@Api("系统日志")
@RestController
@RequestMapping("/sys/log")
public class SysLogController implements IBaseController<SysLog> {

    @Resource
    private ISysLogService sysLogService;

    @Override
    public HttpResult save(SysLog record) {
        try {
            return ResultGenerator.genSuccessResult(sysLogService.save(record));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

    @Override
    public HttpResult findById(Long id) {
        try {
            return ResultGenerator.genSuccessResult(sysLogService.findById(id));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

    @Override
    public HttpResult update(SysLog record) {
        try {
            return ResultGenerator.genSuccessResult(sysLogService.update(record));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

    @ApiOperation("日志普通查询")
    @Override
    public HttpResult findAll() {
        try {
            return ResultGenerator.genSuccessResult(sysLogService.findAll());
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

    @ApiOperation("日志分页查询")
    @Override
    public HttpResult findPage(PageRequest pageRequest) {
        try {
            return ResultGenerator.genSuccessResult(sysLogService.findPage(pageRequest));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }
}