package com.roachfu.app.module.demo.service;

import com.roachfu.app.module.demo.pojo.dto.DemoListDTO;
import com.roachfu.app.module.demo.pojo.dto.DemoSaveDTO;
import com.roachfu.app.module.demo.pojo.dto.DemoUpdateDTO;
import com.roachfu.app.module.demo.pojo.vo.DemoInfoVo;
import com.roachfu.app.pojo.entity.Page;

import java.util.List;

/**
 * @author fuqiang
 * @time 2017/2/26 16:43
 */
public interface DemoService {

    List<DemoInfoVo> listByPage(Page page, DemoListDTO demoList);

    /**
     * 根据id获取详情
     * @param id
     * @return
     */
    DemoInfoVo getDemoInfoById(String id);

    /**
     * 根据id更新demo
     * @param demoUpdate
     * @return
     */
    int updateDemoById(DemoUpdateDTO demoUpdate);

    /**
     * 根据id删除demo记录
     * @param id
     * @return
     */
    int deleteDemoById(String id);

    /**
     * 新增一条demo记录
     * @param demoSave
     * @return
     */
    int saveDemo(DemoSaveDTO demoSave);

}
