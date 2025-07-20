package com.itheima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ClazzMapper;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;
import com.itheima.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public PageResult<Clazz> getPage(EmpQueryParam empQueryParam) {
        PageHelper.startPage(empQueryParam.getPage(),empQueryParam.getPageSize());
        List<Clazz> byPage = clazzMapper.findByPage(empQueryParam);
        byPage.forEach(bp->{
            LocalDate beginDate = bp.getBeginDate();
            LocalDate endDate = bp.getEndDate();
            LocalDate now = LocalDate.now();
            if(beginDate.isAfter(now)){
                bp.setStatus("未开课");
            } else if (endDate.isBefore(now)) {
                bp.setStatus("已结课");
            } else {
                bp.setStatus("在读");
            }
        });
        Page<Clazz> page = (Page<Clazz>) byPage;
        return new PageResult(page.getTotal(),page.getResult());
    }
}
