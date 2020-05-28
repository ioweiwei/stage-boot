package io.xiaowei.core.app.user.service.impl;

import io.xiaowei.core.app.user.jpa.UserRepository;
import io.xiaowei.core.app.user.model.User;
import io.xiaowei.core.app.user.service.IUserService;
import io.xiaowei.global.exception.BusinessException;
import io.xiaowei.global.vo.request.app.LoginForm;
import io.xiaowei.global.vo.request.app.RegisterForm;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/27 10:36 上午
 * @Version 1.0
 **/
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User login(LoginForm form) {
        User user = userRepository.findByMobile(form.getMobile());
        if (user == null) {
            throw new BusinessException("用户不存在");
        }
        if (!user.getPassword().equals(DigestUtils.sha256Hex(form.getPassword()))) {
            throw new BusinessException("密码错误");
        }
        return user;
    }

    @Override
    public User register(RegisterForm form) {
        User user = new User();
        user.setUsername(form.getMobile());
        user.setMobile(form.getMobile());
        user.setPassword(DigestUtils.sha256Hex(form.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (!userOptional.isPresent()) {
            throw new BusinessException("用户不存在");
        }
        return userOptional.get();
    }
}
