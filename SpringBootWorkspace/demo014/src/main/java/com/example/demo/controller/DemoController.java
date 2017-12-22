package com.example.demo.controller;

import com.example.demo.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 */
@RestController
public class DemoController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/valid")
    public String valid(@Valid Demo demo, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            StringBuilder stringBuilder = new StringBuilder();
            List<FieldError> fieldErrorList = bindingResult.getFieldErrors();

            Locale locale = LocaleContextHolder.getLocale();
            for (FieldError fieldError : fieldErrorList) {
                String message = messageSource.getMessage(fieldError, locale);
                stringBuilder.append(fieldError.getField() + ":" + message + " ,");
            }
            return stringBuilder.toString();
        }
        return "验证通过，" + "名称：" + demo.getName() + "年龄：" + demo.getAge() + "邮箱地址：" + demo.getMail();
    }

}
