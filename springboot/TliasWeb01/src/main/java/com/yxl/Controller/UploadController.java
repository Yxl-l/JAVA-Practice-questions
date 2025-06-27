package com.yxl.Controller;

import com.yxl.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UploadController {
    private static final String UPLOAD_DIR = "D:/";
    /**
     * 上传文件 - 参数名file
     */
    @CrossOrigin
    @PostMapping("/upload")
    public Result postUpload(MultipartFile file) throws IOException {
        log.info("上传文件{}",file);
        if (!file.isEmpty()){
            String originalFilename = file.getOriginalFilename();//文件名
            String extName = originalFilename.substring(originalFilename.lastIndexOf("."));//切出完整后缀名
            String uniqueFileName = UUID.randomUUID().toString().replace("-","")+extName;
            File targetFile = new File(UPLOAD_DIR + uniqueFileName);
            if (!targetFile.getParentFile().exists()){//文件路径不存在则创建
                targetFile.getParentFile().mkdir();
            }
            file.transferTo(targetFile);
        }
        return Result.success("文件上传成功");
    }
}