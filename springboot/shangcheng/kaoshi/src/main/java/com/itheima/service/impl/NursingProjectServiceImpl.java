package com.itheima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.NursingProjectMapper;
import com.itheima.pojo.NursingProject;
import com.itheima.pojo.NursingProjectParam;
import com.itheima.pojo.PageResult;
import com.itheima.service.NursingProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingProjectServiceImpl extends ServiceImpl<NursingProjectMapper, NursingProject> implements NursingProjectService {

    @Autowired
    private NursingProjectMapper nursingProjectMapper;

    @Override
    public PageResult page(NursingProjectParam nursingProjectParam) {
        PageHelper.startPage(nursingProjectParam.getPage(),nursingProjectParam.getPageSize());
        List<NursingProject> page = nursingProjectMapper.getPage(nursingProjectParam);
        Page<NursingProject> list = (Page<NursingProject>) page;
        return new PageResult(list.getTotal(),list.getResult());
    }
}
