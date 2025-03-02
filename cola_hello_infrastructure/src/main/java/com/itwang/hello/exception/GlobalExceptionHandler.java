package com.itwang.hello.exception;


import com.itwang.hello.response.ResponseResult;

//import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理类
 *
 * @author sunxiaozhi
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 拦截未知的运行时异常
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseResult<String> handleRuntimeException(RuntimeException runtimeException, HttpServletRequest request)
    {
        return ResponseResult.fail(runtimeException.getMessage());
    }

    /**
     * 系统异常
     */
    @ExceptionHandler(Exception.class)
    public ResponseResult<String> handleException(Exception exception, HttpServletRequest request)
    {
        return ResponseResult.fail(exception.getMessage());
    }
}
