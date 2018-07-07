package com.roachfu.app.module.demo.pojo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 添加demo的数据传输对象
 * @author fuqiang
 * @time 2017/2/27 23:11
 */

@Data
@ToString
public class DemoSaveDTO implements Serializable {

    private static final long serialVersionUID = -6858772562134176280L;

    private String demoName;

    private String demoValue;

}
