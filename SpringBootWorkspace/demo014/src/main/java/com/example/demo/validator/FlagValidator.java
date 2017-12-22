package com.example.demo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by wsh on 2017/12/19.
 * 自定义注解 实现自定义校验
 *
 * @version 1.0
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = FlagConstraintValidator.class)
public @interface FlagValidator {

    //flag的有效值多个使用','隔开
    String values();

    String message() default "flag 不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
