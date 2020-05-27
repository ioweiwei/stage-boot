package io.xiaowei.global.common;

import io.xiaowei.global.common.request.PageRequest;
import io.xiaowei.global.common.vo.SimplePage;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName BaseService
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 12:19 上午
 * @Version 1.0
 **/
public abstract class BaseService<T> implements IBaseService<T> {

    @Resource
    private BaseJpaRepository<T> baseJpaRepository;

    @Override
    public T save(T t) {
        return baseJpaRepository.save(t);
    }

    @Override
    public T update(T t) {
        return baseJpaRepository.saveAndFlush(t);
    }

    @Override
    public List<T> findAll() {
        return baseJpaRepository.findAll();
    }

    @Override
    public T findById(Long id) {
        Optional<T> optional = baseJpaRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public abstract SimplePage<T> findPage(PageRequest pageRequest);

    @Override
    public abstract List<T> findAll(PageRequest pageRequest);
}
