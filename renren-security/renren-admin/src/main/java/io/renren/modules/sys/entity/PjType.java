package io.renren.modules.sys.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("pj_type")
public class PjType {
    @TableId
    private long id;
    private String name;
    private String bz;
    private Date createTime;
    private String createBy;
}