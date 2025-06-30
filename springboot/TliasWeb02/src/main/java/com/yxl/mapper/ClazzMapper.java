package com.yxl.mapper;

import com.yxl.pojo.Clazz;
import com.yxl.pojo.ClazzQueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClazzMapper {

    /**
     * 添加
     */

    void postClazz(Clazz clazz);

    /**
     * 查询所有
     */
    List<Clazz> getClazz();

    /**
     * 分页条件查询
     */
    List<Clazz> getClazzList(ClazzQueryParam clazzQueryParam);
    /**
     * 根据id删除班级
     */
    void deleteClazz(Integer id);

    void putClazz(Clazz clazz);

    Clazz getClazzId(Integer id);
}

