package com.example.demo.handler;

import org.springframework.web.bind.annotation.*;

/**
 * Created by wsh on 2017/12/20.
 *
 * @version 1.0
 */

@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseStatus
    public ApiResult runtimeExceptionHandler(Exception e) {
        return ApiGenerator.errorsResult(e.getMessage(), e);
    }

}
