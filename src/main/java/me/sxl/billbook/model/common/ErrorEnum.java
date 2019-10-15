package me.sxl.billbook.model.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yyconstantine
 * @date 2019/10/12 13:19
 */
@Getter
@AllArgsConstructor
public enum ErrorEnum {

    // 系统内部错误
    UNKNOWN(500,"系统内部错误，请联系技术支持"),
    DUPLICATE_KEY(501, "请勿重复请求"),
    TOKEN_GENERATOR_ERROR(502, "签名不合法"),
    SQL_ILLEGAL(504, "sql非法"),
    TRANSACTION_ROLLBACK(505, "事务回滚"),

    NO_AUTH(403, "登录状态过期"),
    PATH_NOT_FOUND(404, "路径不存在，请检查路径"),

    // 请求错误
    METHOD_ARGS_ERROR(400, "参数验证失败"),

    // 统一的错误
    GLOBAL_ADD_ERROR(1001, "添加失败"),
    GLOBAL_EDIT_ERROR(1002, "修改失败"),
    GLOBAL_DELETE_ERROR(1003, "删除失败"),
    GLOBAL_SEARCH_ERROR(1004, "查询失败");

    // 业务错误定义

    private int code;

    private String msg;

}
