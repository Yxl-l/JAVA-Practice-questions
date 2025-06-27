package com.yxl.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClazzQueryParam {

    private Integer page = 1; //页码
    private Integer pageSize = 10; //每页展示记录数
    private String name; //班级名
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate beginDate; //开课时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate; //结课时间
}
