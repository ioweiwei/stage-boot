package io.xiaowei.core.app.test;

import io.xiaowei.core.app.user.model.User;
import io.xiaowei.core.app.user.service.IUserService;
import io.xiaowei.global.utils.RedisKit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName RedisCtrl
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/28 10:14 上午
 * @Version 1.0
 **/
@RequestMapping("/redis")
@RestController
public class RedisCtrl {

    @Resource
    private RedisKit redisKit;

    @Resource
    private IUserService userService;

    @GetMapping("/get/{key}")
    public Object getKey(@PathVariable(value = "key") String key) {
        return redisKit.get(key);
    }

    @GetMapping("/set/{key}/{value}")
    public Boolean setKey(@PathVariable(value = "key") String key, @PathVariable(value = "value") Long value) {
        User user = userService.findById(value);
        return redisKit.set(key, user);
    }


}
