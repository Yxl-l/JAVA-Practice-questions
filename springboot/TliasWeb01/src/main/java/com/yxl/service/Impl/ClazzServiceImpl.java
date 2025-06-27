package com.yxl.service.Impl;

import com.yxl.mapper.ClazzMapper;
import com.yxl.pojo.Clazz;
import com.yxl.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {


    @Override
    public List<Clazz> getClazz() {
        return clazzMapper.getClazz();
    }

    @Autowired
    private ClazzMapper clazzMapper;



    @Override
    public void postClazz(Clazz clazz) {
      clazz.setCreateTime(LocalDateTime.now());
      clazz.setUpdateTime(LocalDateTime.now());
      clazzMapper.postClazz(clazz);

    }
}
