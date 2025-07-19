package com.exam.service.Impl;

import com.exam.Utils.JwtUtils;
import com.exam.mapper.UserMapper;
import com.exam.pojo.LoginInfo;
import com.exam.pojo.PageResult;
import com.exam.pojo.User;
import com.exam.pojo.UserResult;
import com.exam.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;
    /**
     * 登录
     */
    @Override
    public LoginInfo login(User user) {
        //查询到匹配的用户名和密码返回该用户全部信息
        User userNew =  userMapper.getUsernameAndPassword(user);
        if (userNew!=null){
            //登录成功生成令牌给登录信息对象
            Map<String,Object> map = new HashMap<>();
            map.put("id",userNew.getUserId());
            String token = JwtUtils.generateJwt(map);
            //生成令牌给登录信息对象
            return new LoginInfo(userNew.getUserId(),userNew.getUsername(),userNew.getName(),token);
        }
        return null;
    }

    /**
     * 分页列表
     */
    @Override
    public PageResult getUserList(UserResult userResult) {

        PageHelper.startPage(userResult.getPage(),userResult.getPageSize());
        List<User> list = userMapper.getUserList(userResult);
        Page<User> p = (Page<User>) list;
        return new PageResult(p.getTotal(),p.getResult());
    }
    /**
     * id查询
     */
    @Override
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

}


