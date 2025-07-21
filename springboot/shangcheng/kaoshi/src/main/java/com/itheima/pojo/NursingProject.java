package com.itheima.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NursingProject {

    /** 编号 */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /** 名称 */
    private String name;

    /** 排序号 */
    private Integer orderNo;

    /** 单位 */
    private String unit;

    /** 价格 */
    private BigDecimal price;

    /** 图片 */
    private String image;

    /** 护理要求 */
    private String nursingRequirement;

    /** 状态（0：禁用，1：启用） */
    private Integer status;

    private String createBy;

    private String updateBy;

    private String remark;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer deleted;



}
