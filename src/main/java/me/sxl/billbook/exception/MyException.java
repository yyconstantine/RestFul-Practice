package me.sxl.billbook.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.sxl.billbook.model.common.ErrorEnum;

/**
 * 业务自定义异常处理
 *
 * @author songxianglong
 * @date 2019/10/14 11:40
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MyException extends RuntimeException{

    private int code = 500;

    private String msg;

    public MyException() {
        super(ErrorEnum.UNKNOWN.getMsg());
        this.msg = ErrorEnum.UNKNOWN.getMsg();
    }

    public MyException(ErrorEnum errorEnum) {
        this.msg = errorEnum.getMsg();
        this.code = errorEnum.getCode();
    }

    public MyException(ErrorEnum errorEnum, Throwable e) {
        super(errorEnum.getMsg(), e);
        this.msg = errorEnum.getMsg();
        this.code = errorEnum.getCode();
    }

    public MyException(String exception) {
        this.msg = exception;
    }

    /**
     * 通过以下两个方法自定义异常打印信息
     * @see #fillInStackTrace() 定义堆栈打印信息，默认打印全部调用链
     * @see #toString() 定义异常输出格式
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        if (this.code == 505)
            return this;
        return super.fillInStackTrace();
    }

    @Override
    public String toString() {
        return "错误信息为 >> {" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }

}
