package com.exam.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 角色
 */
public class Role {
    private Integer roleId;
    private String roleName;
    private List<Permission> permissionId ;
}
