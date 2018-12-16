package com.reported.rarrier.vo;

import com.reported.rarrier.biz.ensure.ApplyBiz;
import com.reported.rarrier.model.ensure.Apply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

/**
 * Created by CDZ on 2018/12/12.
 */
@Component
@PropertySource({"classpath:connection.properties"})
public class Upload {
    //获取存储的物理路径
    @Value("${hdd}")
    private  String hdd;

    @Autowired
    private ApplyBiz applyBiz;

    public  boolean uploadFile(MultipartFile multipartFile, Apply apply) throws IOException {

        Random rnd = new Random();
        String id = String.valueOf(System.currentTimeMillis() + rnd.nextInt(1000));
        //获取文件后缀名
        String suffix = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
        String upath = hdd;
        //映射物理路径
        String file = upath + "\\" + id + suffix;
        byte[] bytes = multipartFile.getBytes();
        File updirFile = new File(upath);
        if(!updirFile.exists()){
            updirFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(file);
        out.write(bytes);
        out.flush();
        out.close();
        apply.setUploadFile(id + suffix);
        applyBiz.insertSelective(apply);
        return true;
    }

}
