package com.roachfu.app.module.demo.controller;

import com.roachfu.app.module.base.controller.BaseController;
import com.roachfu.app.module.demo.pojo.dto.DemoListDTO;
import com.roachfu.app.module.demo.pojo.dto.DemoSaveDTO;
import com.roachfu.app.module.demo.pojo.dto.DemoUpdateDTO;
import com.roachfu.app.module.demo.pojo.vo.DemoInfoVo;
import com.roachfu.app.module.demo.service.DemoService;
import com.roachfu.app.pojo.entity.APIResponse;
import com.roachfu.app.pojo.entity.APIResponse;
import com.roachfu.app.pojo.entity.Meta;
import com.roachfu.app.pojo.entity.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * demo控制层
 *
 * @author fuqiang
 * @time 2017/2/23 21:46
 */

@RestController
@RequestMapping(value = "/demos")
public class DemoController extends BaseController{

    @Resource
    private DemoService demoService;

    @GetMapping
    public APIResponse list(Page page, DemoListDTO demoListDTO) {
        List<DemoInfoVo> demoList = demoService.listByPage(page, demoListDTO);
        return new APIResponse(demoList);
    }

    @GetMapping(value = "/{id}")
    public APIResponse info(@PathVariable("id") String id) {
        DemoInfoVo demoInfo = demoService.getDemoInfoById(id);
        return new APIResponse(demoInfo);
    }

    @PostMapping
    public APIResponse add(@RequestBody DemoSaveDTO demoSave){
        int flag = demoService.saveDemo(demoSave);
        if(flag < 1){
            Meta meta = new Meta(50010002, "添加失败");
            return new APIResponse(meta, null);
        }
        return new APIResponse();
    }

    @DeleteMapping(value = "/{id}")
    public APIResponse delete(@PathVariable("id") String id) {
        int flag = demoService.deleteDemoById(id);
        if(flag < 1){
            Meta meta = new Meta(50010001, "删除失败");
            return new APIResponse(meta, null);
        }
        return new APIResponse();
    }

    @PutMapping(value = "/{id}")
    public APIResponse update(@PathVariable("id") String id, @RequestBody DemoUpdateDTO demoUpdate) {
        demoUpdate.setId(id);

        int flag = demoService.updateDemoById(demoUpdate);
        if (flag < 1) {
            Meta meta = new Meta(50010000, "更新失败");
            return new APIResponse(meta, null);
        }
        return new APIResponse();
    }
}
