package com.roachfu.app.module.demo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.roachfu.app.module.base.pojo.vo.BaseVO;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author fuqiang
 * @time 2017/3/1 0:35
 */

@Data
public class DemoInfoVo extends BaseVO {

    private static final long serialVersionUID = -7315927016100229138L;

    private Long id;

    private String demoName;

    private String demoValue;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
