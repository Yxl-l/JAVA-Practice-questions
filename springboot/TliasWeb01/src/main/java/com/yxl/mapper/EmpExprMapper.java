package com.yxl.mapper;

import com.yxl.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpExprMapper {
    /**
     *员工工作履历
     */
    public void insertBatch(List<EmpExpr> exprList);

    void deleteEmpExpr(List<Integer> ids);
}