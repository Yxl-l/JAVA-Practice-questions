package com.exam.mapper;

import com.exam.pojo.User;
import com.exam.pojo.UserResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 分页列表
     */
    List<User> getUserList(UserResult userResult);
    /**
     * id查询
     */
    User getUser(Integer id);

    User getUsernameAndPassword(User user);
}
