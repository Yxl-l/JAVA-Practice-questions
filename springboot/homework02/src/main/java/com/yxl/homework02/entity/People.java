package com.yxl.homework02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private int id;
    private String name;
    private Integer gender;
    private String image;
    private Integer job;
    private LocalDateTime updateTime;

}
