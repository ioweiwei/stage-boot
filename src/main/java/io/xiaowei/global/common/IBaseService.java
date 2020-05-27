package io.xiaowei.global.common;

import io.xiaowei.global.common.request.PageRequest;
import io.xiaowei.global.common.vo.SimplePage;

import java.util.List;

public interface IBaseService<T> {

    T save(T t);

    T update(T t);

    T findById(Long id);

    List<T> findAll();

    List<T> findAll(PageRequest pageRequest);

    SimplePage<T> findPage(PageRequest pageRequest);


}
