//package com.yxl.demo02;
//import cn.hutool.core.io.IoUtil;
//import com.yxl.demo02.pojo.User;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import java.io.InputStream;
//import java.nio.charset.StandardCharsets;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//@RestController
//@CrossOrigin
//public class UserController {
//    @RequestMapping("/list")
//    public List<User> list(){
//        //1、hutool工具加载文件
//        InputStream is = this.getClass().getClassLoader().getResourceAsStream("user.txt");
//        //1)要读取的文件的输入流
//        //2)指定字符集（UTF-8）
//        //3)要存数据的对象(Collection)
//        ArrayList<String> list = IoUtil.readLines(is,StandardCharsets.UTF_8,new ArrayList<>());
////2、解析文件的内容
//        return  list.stream().map(p->{String[] s = p.split(","); //1)按逗号分隔数据
//            User user = new User();    //2)封装成User对象
//            user.setId(Integer.parseInt(s[0]));
//            user.setUsername(s[1]);
//            user.setPassword(s[2]);
//            user.setName(s[3]);
//            user.setAge(Integer.parseInt(s[4]));
//                    //1）对指定字符串进行转换
//                    //2）转换的格式
//            LocalDateTime localDateTime = LocalDateTime.parse(s[5],DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            return user;})//3、结果集封装成List<Emp>,响应页面
//                .collect(Collectors.toList());
//
//
//
//
//    }
//}
