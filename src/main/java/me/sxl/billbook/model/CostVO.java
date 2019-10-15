package me.sxl.billbook.model;

import lombok.Data;

import java.util.List;

/**
 * 消费展示实体
 *
 * @author yyconstantine
 * @date 2019/10/12 13:23
 */
@Data
public class CostVO {

    private int costId;// 消费表pk

    private double money;// 消费金额

    private String createDate;

    private String content;// 备注

    private List<Category> categories;// 消费类型

    private String userId;// 用户表pk

}
