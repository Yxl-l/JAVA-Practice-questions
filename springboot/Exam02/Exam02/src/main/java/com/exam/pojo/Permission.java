package com.exam.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 权限
 */
public class Permission {
    private Integer permissionId;
    private String permissionName;

}
