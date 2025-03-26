package io.renren.modules.sys.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.sys.entity.PjType;
import io.renren.modules.sys.service.PjTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/sys/pjType")
public class PjTypeController extends AbstractController {
    @Autowired
    private PjTypeService pjTypemService;
    @RequestMapping("/list")
    public R list(Map<String, Object> params){
        PageUtils page = pjTypemService.queryPage(params);
        return R.ok().put("page", page);
    }
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PjType pjType = pjTypemService.getById(id);
        return R.ok().put("pjType", pjType);
    }
    @RequestMapping("/save")
    public R save(@RequestBody PjType pjType){
        pjType.setCreateTime(new Date());
        pjType.setCreateBy(getUser().getUsername());
        pjTypemService.save(pjType);
        return R.ok();
    }
    @RequestMapping("/update")
    public R update(@RequestBody PjType pjType){
        pjTypemService.updateById(pjType);
        return R.ok();
    }
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        pjTypemService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }
}