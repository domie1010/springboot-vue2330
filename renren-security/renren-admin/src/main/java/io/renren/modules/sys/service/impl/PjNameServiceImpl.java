package io.renren.modules.sys.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.sys.dao.PjNameDao;
import io.renren.modules.sys.dao.PjTypeDao;
import io.renren.modules.sys.entity.PjName;
import io.renren.modules.sys.entity.PjType;
import io.renren.modules.sys.service.PjNameService;
import io.renren.modules.sys.service.PjTypeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("pjNameService")
public class PjNameServiceImpl extends ServiceImpl<PjNameDao, PjName> implements PjNameService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String title = (String)params.get("title");
        String pjType = (String)params.get("pjType");

        IPage<PjName> page = this.page(
                new Query<PjName>().getPage(params),
                new QueryWrapper<PjName>()
                        .like(StringUtils.isNotBlank(title),"title", title)
                        .eq("pj_type",pjType)
        );
        return new PageUtils(page);
    }
}