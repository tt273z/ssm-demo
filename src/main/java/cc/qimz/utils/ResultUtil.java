package cc.qimz.utils;

import cc.qimz.enums.ResultEnum;
import cc.qimz.pojo.Result;

/**
 * 返回结果工具类
 */
public class ResultUtil {
    /**
     * 请求成功 返回数据
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result res = new Result();
        res.setCode(0);
        res.setMsg("success");
        res.setData(object);
        return res;
    }

    /**
     * 请求成功
     * @param resultEnum
     * @return
     */
    public static Result success(ResultEnum resultEnum){
        Result res = new Result();
        res.setCode(resultEnum.getCode());
        res.setMsg(resultEnum.getMsg());
        return res;
    }

    /**
     * 请求失败
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg){
        Result res = new Result();
        res.setCode(code);
        res.setMsg(msg);
        return res;
    }

    /**
     * 请求失败
     * @param resultEnum
     * @return
     */
    public static Result error(ResultEnum resultEnum){
        Result res = new Result();
        res.setCode(resultEnum.getCode());
        res.setMsg(resultEnum.getMsg());
        return res;
    }

}
