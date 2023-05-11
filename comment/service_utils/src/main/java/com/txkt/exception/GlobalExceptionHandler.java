package com.txkt.exception;

import com.txkt.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice //aop

public class GlobalExceptionHandler {

    //全局异常处理
    @ExceptionHandler(Exception.class)//必须要加上，即为当有异常的时候就会调用该方法，不然不会执行该方法
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail(null).message("执行全局异常处理");
    }

    //特定异常处理ArithmeticException
    @ExceptionHandler(ArithmeticException.class)//需要处理什么方法就在括号里面加
    @ResponseBody
    public Result error(ArithmeticException e){
        e.printStackTrace();
        return Result.fail(null).message("执行ArithmeticException异常处理");
    }

    //自定义异常处理TxktException
    @ExceptionHandler(TxktException.class)
    @ResponseBody
    public Result error(TxktException e){
        e.printStackTrace();
        return Result.fail(null).code(e.getCode()).message(e.getMsg());
    }



}
