package io.renren.modules.sys.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("pj_name")
public class PjName {
    @TableId
    private long id;
    private String title;
    private String price;
    private String inventory;
    private String pjType;
    private String scTime;
    private String manufacturers;
    private String bz;




}