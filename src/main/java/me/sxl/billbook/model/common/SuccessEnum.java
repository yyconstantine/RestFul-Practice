package me.sxl.billbook.model.common;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author songxianglong
 * @date 2019/10/12 11:58
 */
@Getter
@AllArgsConstructor
public enum SuccessEnum {

    GLOBAL_SEARCH_SUCCESS(200, "查询成功"),
    GLOBAL_ADD_SUCCESS(200, "添加成功"),
    GLOBAL_EDIT_SUCCESS(200, "修改成功"),
    GLOBAL_DELETE_SUCCESS(200, "删除成功");

    private int code;

    private String msg;

}
