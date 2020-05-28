package io.xiaowei.global.common;

import io.xiaowei.global.common.request.PageRequest;
import io.xiaowei.global.common.vo.SimplePage;

import java.util.List;

/**
 * @ClassName BaseService
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 12:19 上午
 * @Version 1.0
 **/
public abstract class BaseService<T> implements IBaseService<T> {

    @Override
    public abstract T save(T t);

    @Override
    public abstract T update(T t);

    @Override
    public abstract List<T> findAll();

    @Override
    public abstract T findById(Long id);

    @Override
    public abstract SimplePage<T> findPage(PageRequest pageRequest);

    @Override
    public abstract List<T> findAll(PageRequest pageRequest);
}
