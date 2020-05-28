package io.xiaowei.core.sys.sys.jpa;

import io.xiaowei.core.sys.sys.model.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysLogRepository extends JpaRepository<SysLog, Long>, JpaSpecificationExecutor<SysLog> {

}
