package io.xiaowei.core.sys.sys.model;

import io.xiaowei.global.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName SysLog
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 12:14 上午
 * @Version 1.0
 **/
@Setter
@Getter
@Entity
@Table(name = "sys_log")
public class SysLog extends BaseEntity {
    //用户名
    @Column(columnDefinition = "varchar(50) comment'用户名'")
    private String username;
    //用户操作
    @Column(columnDefinition = "varchar(50) comment'用户操作'")
    private String operation;
    //请求方法
    @Column(columnDefinition = "varchar(200) comment'请求方法'")
    private String method;
    //请求参数
    @Column(columnDefinition = "text(0) comment'请求参数'")
    private String params;
    //执行时长(毫秒)
    @Column(columnDefinition = "bigint(10) comment'执行时长'")
    private Long time;
    //IP地址
    @Column(columnDefinition = "varchar(50) comment'IP地址'")
    private String ip;
}
