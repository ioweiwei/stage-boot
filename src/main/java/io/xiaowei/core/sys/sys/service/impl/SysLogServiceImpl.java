package io.xiaowei.core.sys.sys.service.impl;

import io.xiaowei.core.sys.sys.jpa.SysLogRepository;
import io.xiaowei.core.sys.sys.model.SysLog;
import io.xiaowei.core.sys.sys.service.ISysLogService;
import io.xiaowei.global.common.BaseService;
import io.xiaowei.global.common.request.PageRequest;
import io.xiaowei.global.common.vo.SimplePage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName SysLogServiceImpl
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 12:26 上午
 * @Version 1.0
 **/
@Service
public class SysLogServiceImpl extends BaseService<SysLog> implements ISysLogService {

    @Resource
    private SysLogRepository sysLogRepository;

    @Override
    public SysLog save(SysLog sysLog) {
        return sysLogRepository.save(sysLog);
    }

    @Override
    public SysLog update(SysLog sysLog) {
        return null;
    }

    @Override
    public List<SysLog> findAll() {
        return null;
    }

    @Override
    public SysLog findById(Long id) {
        return null;
    }

    @Override
    public SimplePage<SysLog> findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public List<SysLog> findAll(PageRequest pageRequest) {
        return null;
    }

}
