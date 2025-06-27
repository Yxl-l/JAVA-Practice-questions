package com.yxl.service;

import com.yxl.pojo.Clazz;
import com.yxl.pojo.ClazzQueryParam;
import com.yxl.pojo.PageResult;

import java.util.List;

public interface ClazzService {

    void postClazz(Clazz clazz);

    List<Clazz> getClazz();

    PageResult getClazzList(ClazzQueryParam clazzQueryParam);

    void deleteClazz(Integer id);

    void putClazz(Clazz clazz);

    Clazz getClassId(Integer id);
}