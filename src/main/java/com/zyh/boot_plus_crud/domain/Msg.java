package com.zyh.boot_plus_crud.domain;

import lombok.Data;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@ToString
public class Msg {
    private Integer code;
    private String msg;
    private Map<String,Object> extend = new HashMap<>();

    public static Msg success(){
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("处理成功!");
        return result;
    }
    public static Msg fail(){
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("处理失败!");
        return result;
    }
    public static Msg error(){
        Msg result = new Msg();
        result.setCode(300);
        result.setMsg("数据有误!");
        return result;
    }
    public Msg add(String key,Object value){
        this.getExtend().put(key, value);
        return this;
    }
}
