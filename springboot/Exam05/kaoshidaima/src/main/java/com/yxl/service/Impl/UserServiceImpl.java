package com.yxl.service.Impl;

import com.yxl.mapper.UserMapper;
import com.yxl.pojo.LoginInfo;
import com.yxl.pojo.User;
import com.yxl.service.UserService;
import com.yxl.utils.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
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
            System.out.println(user.getImage());
            //生成令牌给登录信息对象
            return new LoginInfo(userNew.getUserId(),userNew.getUsername(),userNew.getName(),userNew.getImage(),token);
        }
        return null;
    }
}
