package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.NursingProject;
import com.itheima.pojo.NursingProjectParam;
import com.itheima.pojo.PageResult;

public interface NursingProjectService extends IService<NursingProject> {
    PageResult page(NursingProjectParam nursingProjectParam);
}
