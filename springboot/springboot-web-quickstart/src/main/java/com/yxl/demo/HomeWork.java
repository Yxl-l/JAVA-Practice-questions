package com.yxl.demo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
public class HomeWork {
    private static final List<People> peopleList = new ArrayList<>();

    static {
        peopleList.add(new People(0,"ikun🏀","https://img1.baidu.com/it/u=727183483,306783603&fm=253&fmt=auto&app=120&f=JPEG?w=500&h=500",1,1));
        peopleList.add(new People(1,"蔡徐坤","https://img0.baidu.com/it/u=1844111227,3488174992&fm=253&fmt=auto&app=120&f=JPEG?w=500&h=500",2,2));
        peopleList.add(new People(2,"鸡哥🏀","https://img0.baidu.com/it/u=2496610430,316999243&fm=253&fmt=auto&app=138&f=JPEG?w=199&h=197",1,3));
        peopleList.add(new People(3,"真爱粉","https://img2.baidu.com/it/u=3861723532,3176837490&fm=253&fmt=auto&app=120&f=JPEG?w=667&h=500",1,3));
    }

    @RequestMapping("/homeWork")
    public ResponseEntity<Object> homeWork(HttpServletResponse response)throws IOException{
        //1.设置响应状态码
        return ResponseEntity.status(200)//1.设置响应状态码
                .header("name","itcast") //2.设置响应头
                .body(peopleList); //3.设置响应体
    }

    /**
     * 删除
     */
    @DeleteMapping("/deletePerson")
    //ResponseEntity<Void>表示该接口不返回任何内容体（body）。
    public ResponseEntity<Void> deletePerson(@RequestParam int id) {//从请求中获取名为 id 的参数并转为 int
        peopleList.removeIf(p -> p.getId() == id);
        return ResponseEntity.noContent().build();
        //noContent()是一个静态方法，表示 HTTP 状态码 204 (No Content)，即“成功处理请求但无内容返回”
    }

    /**
     * 查询
     */
    @GetMapping("/getPerson")
    public ResponseEntity<Object> getPerson(@RequestParam String name) {//从请求中获取名为 name 的参数并转为 String
        List<People> result = new ArrayList<>();
        for (People p : peopleList) {
            if (p.getName().equals(name)) {
                result.add(p);
            }
        }

        if (!result.isEmpty()) {
            return ResponseEntity.ok(result); // 有结果，返回 200 和集合
        } else {
            return ResponseEntity.status(404).body(null); // 没有结果，返回 404
        }
    }

}
