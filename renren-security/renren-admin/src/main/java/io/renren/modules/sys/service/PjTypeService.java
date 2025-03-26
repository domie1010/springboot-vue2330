package io.renren.modules.sys.service;
import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.PjType;

import java.util.Map;

public interface PjTypeService extends IService<PjType> {
    PageUtils queryPage(Map<String, Object> params);
}