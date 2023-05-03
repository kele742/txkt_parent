package com.txkt.result;

import lombok.Data;

//统一返回结果类
@Data
public class Result<T> {

    private Integer code;//状态码

    private String message;//返回状态信息（成功失败）

    private T data;//返回数据

    public Result(){

    }
    //成功的方法,没有data数据
    public static<T> Result<T> ok(){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("成功");
        return result;
    }

    //失败的方法，没有data数据
    public static<T> Result<T> fail(){
        Result<T> result = new Result<>();
        result.setCode(201);
        result.setMessage("失败");
        return result;
    }
    //成功的方法,有data数据
    public static<T> Result<T> ok(T data){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("成功");
        if (data != null){
            result.setData(data);
        }
        return result;
    }

    //失败的方法，有data数据
    public static<T> Result<T> fail(T data){
        Result<T> result = new Result<>();
        result.setCode(201);
        result.setMessage("失败");
        if (data != null){
            result.setData(data);
        }
        return result;
    }



}