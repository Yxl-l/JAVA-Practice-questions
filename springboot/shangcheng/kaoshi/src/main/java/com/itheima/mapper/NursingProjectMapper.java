package com.itheima.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.itheima.pojo.NursingProject;
import com.itheima.pojo.NursingProjectParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NursingProjectMapper extends BaseMapper<NursingProject> {

    List<NursingProject> getPage(NursingProjectParam nursingProjectParam);
}
