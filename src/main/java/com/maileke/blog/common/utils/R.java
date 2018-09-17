package com.maileke.blog.common.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * shieason 2018.09.17
 * 访问状态信息: 统一的结果返回封装
 * 结果有3个属性，状态码，返回信息，返回数据。succ()，fail()方法是封装好的静态方法，返回结果时候可直接调用。
 */

@Getter
@Setter
public class R {

    private String code;
    private String msg;
    private Object data;

    public static R succ(String mess) {
        R m = new R();
        m.setCode("200");
        m.setData(null);
        m.setMsg(mess);

        return m;
    }

    public static R succ(String mess, Object data) {
        R m = new R();
        m.setCode("200");
        m.setData(data);
        m.setMsg(mess);

        return m;
    }

    public static R fail(String mess) {
        R m = new R();
        m.setCode("400");
        m.setData(null);
        m.setMsg(mess);

        return m;
    }

    public static R fail(String mess, Object data) {
        R m = new R();
        m.setCode("400");
        m.setData(data);
        m.setMsg(mess);

        return m;
    }
}
