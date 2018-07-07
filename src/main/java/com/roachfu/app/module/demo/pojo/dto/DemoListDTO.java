package com.roachfu.app.module.demo.pojo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Demo 列表请求实体
 *
 * @author fuqiang
 * @time 2017/2/28 22:18
 */

@Data
@ToString
public class DemoListDTO implements Serializable {

    private String demoName;

    private String demoValue;
}
