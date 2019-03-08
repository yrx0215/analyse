package com.jnshu.miku.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
    private T data;

    public Response(Integer code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Response(Integer code,String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }
}
