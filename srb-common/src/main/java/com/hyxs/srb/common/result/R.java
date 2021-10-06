package com.hyxs.srb.common.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {

    private Integer code;

    private String  msg;

    private Map<String ,Object> data = new HashMap<>();


    private R(){}

    /**
     * 返回成功结果
     * @return
     */
    public static R success(){
        R r = new R();
        r.setCode(ResponseEnum.SUCCESS.getCode());
        r.setMsg(ResponseEnum.SUCCESS.getMsg());
        return r;
    }

    /**
     * 返回失败结果
     * @return
     */
    public static R error(){
        R r = new R();
        r.setCode(ResponseEnum.ERROR.getCode());
        r.setMsg(ResponseEnum.ERROR.getMsg());
        return r;
    }

    /**
     * 设置特定的结果
     * @param resp
     * @return
     */
    public static R setResult(ResponseEnum resp){
        R r = new R();
        r.setCode(resp.getCode());
        r.setMsg(resp.getMsg());
        return r;
    }

    /**
     * 添加数据
     * @param key
     * @param value
     * @return
     */
    public R data(String key,Object value){
        this.data.put(key,value);
        return this;
    }

    /**
     * 直接添加数据集合
     * @param map
     * @return
     */
    public R data(Map<String ,Object> map){
        this.setData(map);
        return this;
    }

    /**
     * 设置消息
     * @param message
     * @return
     */
    public R message(String message){
        this.setMsg(message);
        return this;
    }

    /**
     * 设置返回码
     * @param code
     * @return
     */
    public R code(Integer code){
        this.setCode(code);
        return this;
    }
}
