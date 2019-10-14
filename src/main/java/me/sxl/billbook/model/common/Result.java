package me.sxl.billbook.model.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * 统一响应体
 *
 * @author yyconstantine
 * @date 2019/10/12 11:53
 */
@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)// 当定义属性为null时不返回
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    public static <T> Result<T> ok (int code, String msg, T data) {
        return setResult(code, msg, data);
    }

    public static <T> Result<T> ok (SuccessEnum successEnum, T data) {
        return setResult(successEnum.getCode(), successEnum.getMsg(), data);
    }

    public static <T> Result<T> ok (T data) {
        return setResult(SuccessEnum.GLOBAL_SEARCH_SUCCESS.getCode(), SuccessEnum.GLOBAL_SEARCH_SUCCESS.getMsg(), data);
    }

    public static <T> Result<T> ok (SuccessEnum successEnum) {
        return setResult(successEnum.getCode(), successEnum.getMsg(), null);
    }

    public static <T> Result<T> error(ErrorEnum errorEnum) {
        return setResult(errorEnum.getCode(), errorEnum.getMsg(), null);
    }

    public static <T> Result<T> error(int code, String msg) {
        return setResult(code, msg, null);
    }

    private static <T> Result<T> setResult(int code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

}
