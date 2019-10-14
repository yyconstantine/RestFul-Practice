package me.sxl.billbook.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author songxianglong
 * @date 2019/10/12 13:24
 */
@Data
@ApiModel(description = "账单分类实体")
public class Category {

    @ApiModelProperty(value = "类别id", example = "001", required = true)
    @NotNull(message = "类别id不能为空")
    private int categoryId;

    @ApiModelProperty(value = "类别名称", example = "日常", required = true)
    @NotNull(message = "类别名称不能为空")
    private String categoryName;

}
