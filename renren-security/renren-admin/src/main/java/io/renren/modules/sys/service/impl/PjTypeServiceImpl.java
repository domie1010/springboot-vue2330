package io.renren.modules.sys.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.sys.dao.PjTypeDao;
import io.renren.modules.sys.entity.Inform;
import io.renren.modules.sys.entity.PjType;
import io.renren.modules.sys.service.PjTypeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pjTypeService")
public class PjTypeServiceImpl extends ServiceImpl<PjTypeDao, PjType> implements PjTypeService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String name = (String)params.get("name");
        IPage<PjType> page = this.page(
                new Query<PjType>().getPage(params),
                new QueryWrapper<PjType>()
                        .like(StringUtils.isNotBlank(name),"name", name)
        );
        return new PageUtils(page);
    }
}