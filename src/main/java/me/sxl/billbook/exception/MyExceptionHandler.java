package me.sxl.billbook.exception;

import lombok.extern.slf4j.Slf4j;
import me.sxl.billbook.model.common.ErrorEnum;
import me.sxl.billbook.model.common.Result;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 业务自定义异常处理器
 *
 * @author yyconstantine
 * @date 2019/10/14 11:41
 */
@Slf4j
@RestControllerAdvice
public class MyExceptionHandler {

    /**
     * 自定义异常
     */
    @ExceptionHandler(MyException.class)
    public Result handleMyException(MyException e) {
        log.error("请求错误,错误码为{},错误信息为{}", e.getCode(), e.getMsg());
        return Result.error(e.getCode(), e.getMsg());
    }

    /**
     * 参数校验异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error(e.getBindingResult().getFieldError().getDefaultMessage(), e);
        return Result.error(400, e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(BindException.class)
    public Result handleBindException(BindException e) {
        log.error(e.getBindingResult().getFieldError().getDefaultMessage(), e);
        return Result.error(400, e.getBindingResult().getFieldError().getDefaultMessage());
    }

    /**
     * 全局异常,此处如果不定义则异常会放行,报错控制台不打印
     */
    @ExceptionHandler(Exception.class)
    public Result handleGlobalException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(ErrorEnum.UNKNOWN);
    }

}
