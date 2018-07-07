package com.roachfu.app.module.demo.pojo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author fuqiang
 * @time 2017/2/27 23:36
 */

@Data
@ToString
public class DemoUpdateDTO implements Serializable {

    private static final long serialVersionUID = -1224223041419314334L;

    private Long id;

    private String demoName;

    private String demoValue;

}