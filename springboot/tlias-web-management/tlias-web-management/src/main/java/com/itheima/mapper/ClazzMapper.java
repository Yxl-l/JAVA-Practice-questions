package com.itheima.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClazzMapper extends BaseMapper<Clazz> {

    List<Clazz> findByPage(EmpQueryParam empQueryParam);
}
