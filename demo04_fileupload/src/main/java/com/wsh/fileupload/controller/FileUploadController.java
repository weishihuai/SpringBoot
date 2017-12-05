package com.wsh.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

/**
 * Created by wsh on 2017/12/5.
 * SpringBoot 文件上传Controller
 */
@Controller
public class FileUploadController {

    //访问地址： http://127.0.0.1:8080/file
    @RequestMapping(value = "/file")
    public String file() {
        return "/fileupload";
    }

    @RequestMapping("/handleFileUpload")
    @ResponseBody
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                bufferedOutputStream.write(file.getBytes());
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败" + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败" + e.getMessage();
            }
            return "上传成功";
        } else {
            return "上传失败，因为文件是空的";
        }
    }

    //访问地址： http://127.0.0.1:8080/batchUpload
    @RequestMapping(value = "/batchUpload")
    public String batchUpload() {
        return "/multifilebatchupload";
    }


    @RequestMapping(value = "/batchFileUpload", method = RequestMethod.POST)
    public @ResponseBody
    String batchUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream bufferedOutputStream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                    bufferedOutputStream.write(bytes);

                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "上传成功";
    }


}
