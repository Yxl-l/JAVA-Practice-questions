package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.utils.AliyunOSSOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
public class UploadController {
    private static final String ABCD = "E:/ABCD/";
    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
            String originalFilename = file.getOriginalFilename();
            // 上传文件
            String url = aliyunOSSOperator.upload(file.getBytes(), originalFilename);
            return Result.success(url);
        }
        return Result.error("上传失败");


        //if (!file.isEmpty()){
        //    String originalFilename = file.getOriginalFilename();
        //    String sub = originalFilename.substring(originalFilename.lastIndexOf("."));
        //    String replace = UUID.randomUUID().toString().replace("-", "");
        //    String name = replace + sub;
        //    File file1 = new File(ABCD, name);
        //    // 如果目标目录不存在，则创建它
        //    if (!file1.getParentFile().exists()) {
        //        file1.getParentFile().mkdirs();
        //    }
        //    // 保存文件
        //    file.transferTo(file1);
        //}
        //return Result.success();
    }
}
