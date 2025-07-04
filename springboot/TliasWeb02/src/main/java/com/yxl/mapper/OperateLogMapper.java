package com.yxl.mapper;

import com.yxl.pojo.OperateLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperateLogMapper {
    //插入日志数据

     void insert(OperateLog log);

    List<OperateLog> getLog();
}
