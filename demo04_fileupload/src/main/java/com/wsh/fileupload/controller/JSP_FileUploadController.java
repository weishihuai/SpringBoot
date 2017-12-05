package com.wsh.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by wsh on 2017/12/5.
 * SpringBoot 文件上传Controller  (jsp方式)
 */
@Controller
public class JSP_FileUploadController {

    /**
     * 初始化上传文件界面
     * 访问地址： http://127.0.0.1:8080/index
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "/index";
    }

    /**
     * 上传文件方法
     *
     * @param file 文件对象
     * @return
     */
    @RequestMapping(value = "/jspHandleFileUpload", method = RequestMethod.POST)
    @ResponseBody
    public String jspHandleFileUpload(HttpServletRequest request, MultipartFile file) {
        String uploadDir = request.getSession().getServletContext().getRealPath("/") + "upload/";
        File dir = new File(uploadDir);
        if (!dir.exists()) {
            dir.mkdir();
        }
//        String fileName = file.getOriginalFilename();
        //自定义文件名
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = UUID.randomUUID() + suffix;
        File serverFile = new File(uploadDir + fileName);
        try {
            file.transferTo(serverFile);
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }

    private void executeUpload(String uploadDir, MultipartFile file) throws Exception {
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = UUID.randomUUID() + suffix;
        File serverFile = new File(uploadDir + fileName);
        file.transferTo(serverFile);
    }

    @RequestMapping(value = "/uploads", method = RequestMethod.POST)
    public @ResponseBody
    String uploads(HttpServletRequest request, MultipartFile[] file) {
        String uploadDir = request.getSession().getServletContext().getRealPath("/") + "upload/";
        File dir = new File(uploadDir);
        if (!dir.exists()) {
            dir.mkdir();
        }
        for (int i = 0; i < file.length; i++) {
            if (file[i] != null) {
                MultipartFile files = file[i];
                try {
                    String suffix = files.getOriginalFilename().substring(files.getOriginalFilename().lastIndexOf("."));
                    String fileName = UUID.randomUUID() + suffix;
                    File serverFile = new File(uploadDir + fileName);
                    files.transferTo(serverFile);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return "上传成功";
    }
}
