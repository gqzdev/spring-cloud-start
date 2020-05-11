package com.gqzdev.util;

import java.util.HashMap;

/**
 *  response 结果 返回封装集
 */

public class Result extends HashMap{
    public static String SUCCESS_CODE="200";
    public static String ERROR_CODE="500";
    public static String DATA_KEY = "data";
    public static String MSG_KEY = "msg";

    private Result(){

    }

    /**
     *  调用父类的HashMap put将key-value放入，并且返回自己
     *  可以链式调用
     */

    public Result set(String key, Object object){
        super.put(key,object);
        return  this;
    }

    private  static Result ok(){
        return new Result();
    }

    public static Result success(){
        return Result.ok().set("code", Result.SUCCESS_CODE).set(Result.MSG_KEY,"操作成功");
    }


    public static Result success(String msg){
        return Result.ok().set("code", Result.SUCCESS_CODE).set(Result.MSG_KEY,msg);
    }


    public static Result success(String msg, Object object){
        return Result.ok().set("code", Result.SUCCESS_CODE).set(Result.MSG_KEY,msg).set(Result.DATA_KEY,object);
    }


    public Result data(Object obj){
        return this.set("data",obj);
    }

    public static Result error(){
        return Result.ok().set(Result.MSG_KEY,"操作失败").set("code", Result.ERROR_CODE);
    }


    public static Result error(String msg){
        return Result.ok().set(Result.MSG_KEY,msg).set("code", Result.ERROR_CODE);
    }


    public static Result error(String msg, Object object){
        return Result.ok().set(Result.MSG_KEY,msg).set(Result.DATA_KEY,object).set("code", Result.ERROR_CODE);
    }

}
