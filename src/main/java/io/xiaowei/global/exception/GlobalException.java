package io.xiaowei.global.exception;

import io.xiaowei.global.http.HttpResult;
import io.xiaowei.global.http.HttpStatus;
import io.xiaowei.global.http.ResultGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @ClassName GlobalException
 * @Description 异常处理
 * @Author xiaowei
 * @Date 2020/5/26 10:59 下午
 * @Version 1.0
 **/
@Slf4j
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(BusinessException.class)
    public HttpResult handlerBusinessException(BusinessException e) {
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(e.getCode());
        httpResult.setMessage(e.getMessage());
        return httpResult;
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public HttpResult handlerNoFoundException(Exception e) {
        log.error(e.getMessage(), e);
        return ResultGenerator.genFailResult(HttpStatus.SC_NOT_FOUND, "路径不存在，请检查路径是否正确");
    }

//    @ExceptionHandler(DuplicateKeyException.class)
//    public HttpResult handleDuplicateKeyException(DuplicateKeyException e) {
//        log.error(e.getMessage(), e);
//        return R.error("数据库中已存在该记录");
//    }

//    @ExceptionHandler(AuthorizationException.class)
//    public HttpResult handleAuthorizationException(AuthorizationException e){
//        logger.error(e.getMessage(), e);
//        return R.error("没有权限，请联系管理员授权");
//    }

    @ExceptionHandler(Exception.class)
    public HttpResult handleException(Exception e) {
        log.error(e.getMessage(), e);
        return ResultGenerator.genFailResult();
    }

}
