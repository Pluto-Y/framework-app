package com.roachfu.app.module.demo.dao.impl;

import com.roachfu.app.module.base.dao.impl.BaseDaoImpl;
import com.roachfu.app.module.demo.dao.DemoDao;
import com.roachfu.app.module.demo.pojo.entity.Demo;
import org.springframework.stereotype.Repository;

/**
 * @author fuqiang
 * @time 2017/2/26 16:45
 */

@Repository
public class DemoDaoImpl extends BaseDaoImpl<Demo, String> implements DemoDao {

}
