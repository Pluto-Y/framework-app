package com.roachfu.app.module.demo.pojo.entity;

import com.roachfu.app.util.id.IdGenUtils;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * demo实体
 *
 * @author fuqiang
 * @time 2017/2/26 16:45
 */

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Demo implements Serializable {

    private static final long serialVersionUID = -8044492176969321081L;

    private Long id;

    private String demoName;

    private String demoValue;

    /**
     * demo状态：0=删除、1=正常
     */
    private Integer demoStatus;

    private Date updateTime;

    private Date createTime;

    public void init() {
        this.id = IdGenUtils.getFlowIdWorkerInstance().nextId();
        this.createTime = new Date();
        this.updateTime = new Date();
        this.demoStatus = 1;
    }
}
