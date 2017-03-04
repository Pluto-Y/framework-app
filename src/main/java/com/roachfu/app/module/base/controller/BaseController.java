package com.roachfu.app.module.base.controller;

import com.roachfu.app.pojo.entity.APIResponse;
import com.roachfu.app.pojo.entity.Meta;
import com.roachfu.app.pojo.enums.ErrorTypeEnum;
import com.roachfu.app.pojo.exception.ServiceException;
import com.roachfu.app.pojo.exception.URLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局异常处理
 *
 * @author fuqiang
 * @time 2017/3/4 13:21
 */
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 500 - Internal Server Error
     */
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public APIResponse handleException(Exception e) {
        logger.error("something error : ", e);
        Meta meta = new Meta(ErrorTypeEnum.ERROR);
        return new APIResponse(meta, null);
    }

    /**
     * 404- not fonud
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(URLException.class)
    public APIResponse handleURLException() {
        Meta meta = new Meta(404, "The requested resource is not available.");
        return new APIResponse(meta, null);
    }

    /**
     * 406 - 服务端逻辑错误
     */
//	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler(ServiceException.class)
    public APIResponse handleLogicalException(ServiceException e) {
        Meta meta = new Meta(e.getCode(), e.getMessage());
        return new APIResponse(meta, null);
    }

}
