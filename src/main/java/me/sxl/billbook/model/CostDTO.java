package me.sxl.billbook.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author songxianglong
 * @date 2019/10/14 11:33
 */
@Data
@ApiModel(description = "账单添加/修改实体类")
public class CostDTO {

    @ApiModelProperty(value = "用户id", example = "001", required = true)
    @NotNull(message = "用户id不能为空")
    private String userId;

    @ApiModelProperty(value = "账单金额", example = "100.00", required = true)
    @NotNull(message = "金额不能为空")
    private double money;

    @ApiModelProperty(value = "账单备注", example = "请大佬喝🍺", required = false)
    private String content;

    @ApiModelProperty(value = "所属类别", example = "[{'categoryId':'001','categoryName':'日常'}]", required = true)
    @NotNull(message = "所属类别不能为空")
    private List<Category> categories;

}
