package com.roachfu.app.module.demo.service.impl;

import com.roachfu.app.module.demo.dao.DemoDao;
import com.roachfu.app.module.demo.pojo.dto.DemoListDTO;
import com.roachfu.app.module.demo.pojo.dto.DemoSaveDTO;
import com.roachfu.app.module.demo.pojo.dto.DemoUpdateDTO;
import com.roachfu.app.module.demo.pojo.entity.Demo;
import com.roachfu.app.module.demo.pojo.vo.DemoInfoVo;
import com.roachfu.app.module.demo.service.DemoService;
import com.roachfu.app.pojo.entity.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author fuqiang
 * @time 2017/2/26 16:43
 */

@Service
public class DemoServiceImpl implements DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Resource
    private DemoDao demoDao;

    @Override
    public List<DemoInfoVo> listByPage(Page page, DemoListDTO demoListDTO) {
        Demo demo = new Demo();
        BeanUtils.copyProperties(demoListDTO, demo);
        List<Demo> demoList = demoDao.listByPage(page.getPageStart(), page.getPageSize(), demo);
        //List<Demo> demoList = demoDao.getList(demo);
        List<DemoInfoVo> demoVOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(demoList)) {
            for (Demo d : demoList) {
                DemoInfoVo demoInfoVo = new DemoInfoVo();
                BeanUtils.copyProperties(d, demoInfoVo);
                demoVOList.add(demoInfoVo);
            }
        }

        return demoVOList;
    }

    @Override
    public DemoInfoVo getDemoInfoById(Long id) {
        Demo demo = demoDao.getInfoById(id);
        DemoInfoVo vo = null;
        if (demo != null) {
            vo = new DemoInfoVo();
            BeanUtils.copyProperties(demo, vo);
        }
        return vo;
    }

    @Override
    public int updateDemoById(DemoUpdateDTO demoUpdate) {
        Demo demo = new Demo();
        BeanUtils.copyProperties(demoUpdate, demo);
        demo.setUpdateTime(new Date());
        logger.info("demo id {}", demo.getId());

        return demoDao.updateById(demo);
    }

    @Override
    public int deleteDemoById(Long id) {
        return demoDao.deleteById(id);
    }

    @Override
    public int saveDemo(DemoSaveDTO demoSaveDTO) {
        Demo demo = new Demo();
        demo.init();
        BeanUtils.copyProperties(demoSaveDTO, demo);
        logger.info("insert demo is [{}]", demo);
        return demoDao.insert(demo);
    }
}
