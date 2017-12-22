package com.example.demo.handler;

import java.util.List;

/**
 * Created by wsh on 2017/12/20.
 *
 * @version 1.0
 */
public final class ApiGenerator {

    public static ApiResult result(boolean flag, String msg, Object result, String jumpUrl, int rows, Throwable throwable) {
        ApiResult apiResult = ApiResult.newInstance();
        apiResult.setFlag(flag);
        apiResult.setMsg("".equals(msg) ? "执行成功" : msg);
        apiResult.setResult(result);
        apiResult.setJumpUrl(jumpUrl);
        apiResult.setTime(System.currentTimeMillis());
        apiResult.setRows(rows);
        return apiResult;
    }

    public static ApiResult successResult(Object result) {
        int rows = 0;
        if (result instanceof List) {
            rows = ((List) result).size();
        }
        return result(true, "", result, "", rows, null);
    }

    public static ApiResult errorsResult(String msg, Throwable throwable) {
        return result(false, msg, "", "", 0, throwable);
    }

}
