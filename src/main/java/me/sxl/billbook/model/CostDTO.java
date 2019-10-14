package me.sxl.billbook.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author songxianglong
 * @date 2019/10/14 11:33
 */
@Data
public class CostDTO {

    @NotNull(message = "用户id不能为空")
    private String userId;

    @NotNull(message = "金额不能为空")
    private double money;

    private String content;

    @NotNull(message = "所属类别不能为空")
    private List<Category> categories;

}
