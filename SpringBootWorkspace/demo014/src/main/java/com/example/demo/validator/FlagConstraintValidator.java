package com.example.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 */
public class FlagConstraintValidator implements ConstraintValidator<FlagValidator, Object> {

    //临时变量保存flag值列表
    private String values;

    //初始化values的值
    @Override
    public void initialize(FlagValidator flagValidator) {
        //将注解内配置的值赋值给临时变量
        this.values = flagValidator.values();
    }

    //实现验证
    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        //分割定义的有效值
        String[] valArr = values.split(",");
        boolean isFlag = false;
        //遍历比对有效值
        for (String val : valArr) {
            //存在一致跳出循环，赋值isFlag=true
            if (val.equals(o)) {
                isFlag = true;
                break;
            }
        }
        //返回是否存在boolean
        return isFlag;
    }
}
