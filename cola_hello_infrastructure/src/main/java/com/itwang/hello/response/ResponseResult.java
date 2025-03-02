package com.itwang.hello.response;


import com.itwang.hello.enums.ResponseCode;
import lombok.Data;

@Data
public class ResponseResult<T> {

    /**
     * 状态码
     */
    private int code;

    /**
     * 数据
     */
    private T data;

    /**
     * 提示语
     */
    private String msg;

    protected ResponseResult() {
    }

    private static <T> ResponseResult<T> responseResult(int code, String msg, T data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        responseResult.setData(data);
        return responseResult;
    }

    public static <T> ResponseResult<T> success(int rows) {
        return responseResult(ResponseCode.SUCCESS.getCode(), rows > 0 ? "成功" : "失败", null);
    }

    public static <T> ResponseResult<T> success(T data) {
        return responseResult(ResponseCode.SUCCESS.getCode(), "成功", data);
    }

    public static <T> ResponseResult<T> fail(T data) {
        return responseResult(ResponseCode.FAIL.getCode(), "失败", data);
    }
}
