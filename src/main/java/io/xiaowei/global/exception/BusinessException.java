package io.xiaowei.global.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName BusinessException
 * @Description 业务异常
 * @Author xiaowei
 * @Date 2020/5/26 11:00 下午
 * @Version 1.0
 **/
@Setter
@Getter
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;
    private int code = 500;

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public BusinessException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    public BusinessException(String message, int code) {
        super(message);
        this.message = message;
        this.code = code;
    }

    public BusinessException(String message, int code, Throwable e) {
        super(message, e);
        this.message = message;
        this.code = code;
    }


}
