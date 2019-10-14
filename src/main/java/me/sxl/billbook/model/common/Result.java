package me.sxl.billbook.model.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 统一响应体
 *
 * @author yyconstantine
 * @date 2019/10/12 11:53
 */
@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)// 当定义属性为null时不返回
@ApiModel(description = "统一响应结构")
public class Result<T> {

    @ApiModelProperty(value = "返回状态码", example = "200")
    private int code;

    @ApiModelProperty(value = "返回消息", example = "查询成功")
    private String msg;

    @ApiModelProperty(value = "返回数据,为null时不返回此key-value")
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
