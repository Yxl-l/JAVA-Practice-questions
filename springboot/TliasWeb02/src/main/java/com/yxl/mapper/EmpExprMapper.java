package com.yxl.mapper;

import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpExpr;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface EmpExprMapper {

//    添加
    void expr(List<EmpExpr> list);




    /**
     *
     *删除员工工作履历
     */
    void deleteEmpExpr(List<Integer> ids);

}