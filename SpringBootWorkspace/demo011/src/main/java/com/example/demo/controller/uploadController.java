package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 */

@Controller
public class uploadController {

    @RequestMapping("/upload")
    public String upload() {
        return "upload";
    }


    @RequestMapping("/file_upload")
    @ResponseBody
    public String file_upload(HttpServletRequest request, MultipartFile file) {
        String uploadDir = request.getSession().getServletContext().getRealPath("/") + "upload/";
        File dir = new File(uploadDir);
        if (!dir.exists()) {
            dir.mkdir();
        }
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        String newFileName = UUID.randomUUID() + suffix;
        File serverFile = new File(uploadDir + newFileName);
        try {
            file.transferTo(serverFile);
        } catch (IOException e) {

            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }


    @RequestMapping("/file_uploads")
    @ResponseBody
    public String file_upload(HttpServletRequest request, MultipartFile[] file) {
        String uploadDir = request.getSession().getServletContext().getRealPath("/") + "upload/";
        File dir = new File(uploadDir);
        if (!dir.exists()) {
            dir.mkdir();
        }
        for (MultipartFile file1 : file) {
            if (file1 != null && file1.getSize() > 0) {
                String fileName = file1.getOriginalFilename();
                String suffix = fileName.substring(fileName.lastIndexOf("."));
                String newFileName = UUID.randomUUID() + suffix;
                File serverFile = new File(uploadDir + newFileName);
                try {
                    file1.transferTo(serverFile);
                } catch (IOException e) {
                    e.printStackTrace();
                    return "上传失败";
                }
            }
        }
        return "上传成功";
    }

}
