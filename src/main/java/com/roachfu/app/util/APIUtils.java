package com.roachfu.app.util;

import java.util.UUID;

/**
 * @author fuqiang
 * @time 2017/2/27 23:16
 */
public class APIUtils {

    private APIUtils(){}

    /**
     * 生成唯一id
     * @return uuid
     */
    public static String uuid(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
