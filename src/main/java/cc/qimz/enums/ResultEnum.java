package cc.qimz.enums;

public enum ResultEnum {

    UNKNOWN_ERROR(-1, "未知错误"),
    SUCCESS(0, "success"),
    QUERY_ERROR(101, "查询失败"),
    ADD_ERROR(102, "添加失败"),
    UPDATE_ERROR(103, "修改失败"),
    DELETE_ERROR(104, "删除失败");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
