package com.yxl.service.Impl;

import com.yxl.mapper.DeptMapper;
import com.yxl.pojo.Dept;
import com.yxl.service.DeptService;
import com.yxl.utils.NotNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    /**
     * 修改部门
     */
    @Override
    public void putDept(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.putDept(dept);
    }
    /**
     * 根据id查部门
     */
    @Override
    public Dept getDeptById(Integer id) {
        return deptMapper.getDeptById(id);
    }
    /**
     * 添加部门
     */
    @Override
    public void postDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.postDept(dept);
    }
    /****
     * 根据部门ID删除部门信息
     */
    @Override
    public Integer deleteDept(Integer id) {
        //查询部门下是否有员工
        int count = deptMapper.deptEmpCount(id);
        if(count>0){
            throw new NotNullException("对不起，当前部门下有员工，不能直接删除！");
        }
        return deptMapper.delete(id);
    }

    /**
     * 查询所有部门
     */
    @Override
    public List<Dept> getDept() {
        return deptMapper.getDept();
    }
}
