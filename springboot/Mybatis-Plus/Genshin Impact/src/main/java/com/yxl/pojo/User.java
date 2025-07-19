package com.yxl.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer userId; //ID,主键
    private String name; //姓名
    @TableField("user_name")
    private String username; //用户名
    @TableField("pass_word")
    private String password; //密码
    private Integer age;//年龄
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer element;//元素属性
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer weapon;//武器类型
    private String image; //头像
}
