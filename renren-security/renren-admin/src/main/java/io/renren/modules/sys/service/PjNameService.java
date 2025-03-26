package io.renren.modules.sys.service;
import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.PjName;

import java.util.Map;

public interface PjNameService extends IService<PjName> {
    PageUtils queryPage(Map<String, Object> params);
}