package cn.rectcircle.explore.springbootwithjshell.dto;

import java.io.Serializable;

/**
 * @author rectcircle
 * @param <T> 数据类型
 */
public class RespDTO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;

    private String msg;

    private T data;

    public static <T> RespDTO<T> success(T data) {
        return new RespDTO<>(0, "success", data);
    }

    public static RespDTO<?> success() {
        return new RespDTO<>(0, "success", null);
    }

    public static <T> RespDTO<T> failure(String msg) {
        return new RespDTO<>(-1, msg, null);
    }

    public static <T> RespDTO<T> failure(Integer code, String msg) {
        return new RespDTO<>(code, msg, null);
    }

    public RespDTO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RespDTO [code=" + code + ", data=" + data + ", msg=" + msg + "]";
    }

}