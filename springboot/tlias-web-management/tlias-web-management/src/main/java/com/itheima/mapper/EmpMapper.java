package com.itheima.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmpMapper extends BaseMapper<Emp> {

    List<Emp> pageInfo(EmpQueryParam param);

    Emp getInfo(Integer id);
}
