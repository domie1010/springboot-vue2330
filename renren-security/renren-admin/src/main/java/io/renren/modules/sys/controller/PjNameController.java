package io.renren.modules.sys.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.sys.entity.PjName;
import io.renren.modules.sys.service.PjNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/sys/pjName")
public class PjNameController extends AbstractController {
    @Autowired
    private PjNameService pjNamemService;
    @RequestMapping("/list")
    public R list(Map<String, Object> params){
        params.put("pjType","发动机配件");
        PageUtils page = pjNamemService.queryPage(params);
        return R.ok().put("page", page);
    }
    @RequestMapping("/list_QBLG")
    public R list_QBLG(Map<String, Object> params){
        params.put("pjType","曲柄连杆配件");
        PageUtils page = pjNamemService.queryPage(params);
        return R.ok().put("page", page);
    }
    @RequestMapping("/list_PQXT")
    public R list_PQXT(Map<String, Object> params){
        params.put("pjType","排气系统配件");
        PageUtils page = pjNamemService.queryPage(params);
        return R.ok().put("page", page);
    }

    @RequestMapping("/list_ZDX")
    public R list_ZDX(Map<String, Object> params){
        params.put("pjType","''制动系配件");
        PageUtils page = pjNamemService.queryPage(params);
        return R.ok().put("page", page);
    }
    @RequestMapping("/list_RYX")
    public R list_RYX(Map<String, Object> params){
        params.put("pjType","燃油系配件");
        PageUtils page = pjNamemService.queryPage(params);
        return R.ok().put("page", page);
    }
    @RequestMapping("/list_DQYB")
    public R list_DQYB(Map<String, Object> params){
        params.put("pjType","电器仪表配件");
        PageUtils page = pjNamemService.queryPage(params);
        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PjName pjName = pjNamemService.getById(id);
        return R.ok().put("pjName", pjName);
    }

    @RequestMapping("/save")
    public R save(@RequestBody PjName pjName){
        pjNamemService.save(pjName);
        return R.ok();
    }
    @RequestMapping("/update")
    public R update(@RequestBody PjName pjName){
        pjNamemService.updateById(pjName);
        return R.ok();
    }
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        pjNamemService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }
}