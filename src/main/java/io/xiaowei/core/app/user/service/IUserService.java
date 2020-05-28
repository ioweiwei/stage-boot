package io.xiaowei.core.app.user.service;

import io.xiaowei.core.app.user.model.User;
import io.xiaowei.global.vo.request.app.LoginForm;
import io.xiaowei.global.vo.request.app.RegisterForm;

public interface IUserService {
    User login(LoginForm form);

    User register(RegisterForm form);

    User findById(Long id);

}
