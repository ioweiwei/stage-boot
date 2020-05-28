package io.xiaowei.core.app.user.model;

import io.xiaowei.global.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName User
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 10:37 上午
 * @Version 1.0
 **/
@Setter
@Getter
@Entity
@Table(name = "tb_user")
public class User extends BaseEntity {

    /**
     * 用户名
     */
    @Column(columnDefinition = "varchar(50) comment'用户名'", unique = true)
    private String username;
    /**
     * 手机号
     */
    @Column(columnDefinition = "varchar(50) comment'手机号'", unique = true)
    private String mobile;
    /**
     * 密码
     */
    @Column(columnDefinition = "varchar(100) comment'密码'")
    private String password;

}
