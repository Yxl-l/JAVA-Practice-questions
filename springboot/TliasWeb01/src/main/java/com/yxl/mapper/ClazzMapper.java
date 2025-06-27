package com.yxl.mapper;

import com.yxl.pojo.Clazz;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface ClazzMapper {

    /**
     * 添加
     */
    @Insert("insert into clazz(name, room, begin_date, end_date, master_id, subject, create_time, update_time) value(#{name},#{room},#{beginDate},#{endDate},#{masterId},#{subject},#{createTime},#{updateTime}  )")
    void postClazz(Clazz clazz);

    @Select("select * from clazz")
    List<Clazz> getClazz();
}

