package io.renren.modules.sys.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.sys.entity.Inform;
import io.renren.modules.sys.entity.PjType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PjTypeDao extends BaseMapper<PjType> {
}