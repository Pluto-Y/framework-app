package com.roachfu.app.pojo.exception;

import com.roachfu.app.pojo.enums.ErrorTypeEnum;

/**
 * 项目异常父类
 * @author fuqiang
 * @time 2017/3/4 12:16
 */
public class RoachFuException extends RuntimeException{

    private static final long serialVersionUID = -6678216986723750215L;

    /** 错误代码 */
    protected Integer code;
    /** 错误信息 */
    protected String error;

    public RoachFuException(String error) {
        super(error);
    }

    public RoachFuException(Integer code, String error) {
        super(error);
        this.code = code;
        this.error = error;
    }

    public RoachFuException(ErrorTypeEnum errorType) {
        super(errorType.getMsg());
        this.code =errorType.getCode();
        this.error = errorType.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
