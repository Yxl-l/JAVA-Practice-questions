package com.yxl.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yxl.mapper.ClazzMapper;
import com.yxl.mapper.StudentMapper;
import com.yxl.pojo.Clazz;
import com.yxl.pojo.ClazzQueryParam;
import com.yxl.pojo.PageResult;
import com.yxl.service.ClazzService;
import com.yxl.utils.NotNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Clazz getClassId(Integer id) {
        return clazzMapper.getClazzId(id);
    }
    @Override
    public void putClazz(Clazz clazz) {
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(LocalDateTime.now());
        clazzMapper.putClazz(clazz);
    }
    /**
     * 根据id删除班级
     */
    @Override
    public void deleteClazz(Integer id) {
        //查询班级下是否有学生
        int count = studentMapper.countClazzStudents(id);
        if(count>0){
            throw new NotNullException("对不起，当前班级下有学生，不能直接删除！");
        }
        clazzMapper.deleteClazz(id);
    }

    /**
     * 分页条件查询
     */
    @Override
    public PageResult getClazzList(ClazzQueryParam clazzQueryParam) {
        PageHelper.startPage(clazzQueryParam.getPage(),clazzQueryParam.getPageSize());
        List<Clazz> list = clazzMapper.getClazzList(clazzQueryParam);
        for (Clazz clazz : list) {
            if (LocalDate.now().isBefore(clazz.getBeginDate())){
                clazz.setStatus("未开班");
            }else if(LocalDate.now().isAfter(clazz.getEndDate())){
                clazz.setStatus("已结课");
            }else {
                clazz.setStatus("已开班");
            }
        }
        Page<Clazz> pageList = (Page<Clazz>) list;
        return new PageResult(pageList.getTotal(),pageList.getResult());
    }

    /**
     * 查询所有
     */
    @Override
    public List<Clazz> getClazz() {
        return clazzMapper.getClazz();
    }

    /**
     * 添加
     */
    @Override
    public void postClazz(Clazz clazz) {
      clazz.setCreateTime(LocalDateTime.now());
      clazz.setUpdateTime(LocalDateTime.now());
      clazzMapper.postClazz(clazz);

    }
}
