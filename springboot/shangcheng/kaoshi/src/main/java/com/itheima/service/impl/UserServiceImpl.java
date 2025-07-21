package com.itheima.service.impl;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.LoginInfo;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.User;
import com.itheima.pojo.UserParam;
import com.itheima.service.UserService;
import com.itheima.utils.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public PageResult page(UserParam userParam) {
        long total = userMapper.countAll(userParam);
        List<User> page = userMapper.page(userParam);
        return new PageResult(total,page);
    }

    @Override
    public LoginInfo login(User user) {
        User login = userMapper.login(user);
        if (login == null){
            return null;
        }else  {
            Integer id = login.getId();
            String username = login.getUsername();
            String name = login.getName();
            Map<String,Object> map = new HashMap<>();
            map.put("id",id);
            map.put("username",username);
            map.put("name",name);
            return new LoginInfo(id,username,name, JwtUtils.generateJwt(map));
        }
    }
}
