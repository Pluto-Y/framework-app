package com.roachfu.app.pojo.exception;

import com.roachfu.app.pojo.enums.ErrorTypeEnum;

/**
 * @author fuqiang
 * @time 2017/3/4 12:17
 */
public class ServiceException extends RoachFuException{

    private static final long serialVersionUID = 6860512663546508040L;

    public ServiceException(String error) {
        super(error);
    }

    public ServiceException(Integer code, String error) {
        super(code, error);
    }

    public ServiceException(ErrorTypeEnum errorType, String error) {
        super(errorType.getCode(), error);
    }

    public ServiceException(ErrorTypeEnum errorType) {
        super(errorType);
    }

}