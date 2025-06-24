package com.yxl.service;

import com.yxl.pojo.Clazz;

import java.util.List;

public interface ClazzService {

    void postClazz(Clazz clazz);

    List<Clazz> getClazz();

    Clazz getClazzBy(String name, String begin, String end, Integer page, Integer pageSize);

}
