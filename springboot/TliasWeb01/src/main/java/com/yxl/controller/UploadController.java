package com.yxl.controller;

import com.yxl.pojo.Result;
import com.yxl.utils.AliyunOSSOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
public class UploadController {
    @Autowired//注入sdk工具类
    private AliyunOSSOperator aliyunOSSOperator;

    @CrossOrigin
    @PostMapping("/upload")
    public Result postUpload(MultipartFile file) throws Exception {
        log.info("上传文件{}",file);
        if (!file.isEmpty()) {
            String originalFilename = file.getOriginalFilename();//文件名
            assert originalFilename != null;
//            String extName = originalFilename.substring(originalFilename.lastIndexOf("."));//切出完整后缀名
//            String uniqueFileName = UUID.randomUUID().toString().replace("-", "") + extName;
//            生成唯一文件名

            String url = aliyunOSSOperator.upload(file.getBytes(), originalFilename);
            return Result.success(url);
        }
        return Result.error("文件上传失败");
    }
}