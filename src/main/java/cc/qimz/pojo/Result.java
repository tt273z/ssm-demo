package cc.qimz.pojo;

/**
 * http响应数据包装对象
 */
public class Result<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

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
}
