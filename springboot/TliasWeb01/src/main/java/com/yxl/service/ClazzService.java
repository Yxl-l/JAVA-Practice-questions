package com.yxl.service;

import com.yxl.pojo.Clazz;

import java.util.List;

public interface ClazzService {

    void postClazz(Clazz clazz);

    List<Clazz> getClazz();

}