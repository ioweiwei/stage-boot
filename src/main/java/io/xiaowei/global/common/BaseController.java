package io.xiaowei.global.common;


import io.xiaowei.global.common.request.PageRequest;
import io.xiaowei.global.http.HttpResult;
import io.xiaowei.global.http.ResultGenerator;

import javax.annotation.Resource;

/**
 * @ClassName BaseController
 * @Description Base Controller
 * @Author xiaowei
 * @Date 2020/5/23 8:41 下午
 * @Version 1.0
 **/
public class BaseController<T> implements IBaseController<T> {

    @Resource
    private IBaseService<T> baseService;

    @Override
    public HttpResult save(T record) {
        try {
            return ResultGenerator.genSuccessResult(baseService.save(record));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

    @Override
    public HttpResult findById(Long id) {
        try {
            return ResultGenerator.genSuccessResult(baseService.findById(id));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

    @Override
    public HttpResult update(T record) {
        try {
            return ResultGenerator.genSuccessResult(baseService.update(record));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

    @Override
    public HttpResult findAll() {
        try {
            return ResultGenerator.genSuccessResult(baseService.findAll());
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

    @Override
    public HttpResult findPage(PageRequest pageRequest) {
        try {
            return ResultGenerator.genSuccessResult(baseService.findPage(pageRequest));
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }
}
