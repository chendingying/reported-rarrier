package com.reported.rarrier.mapper.ensure;

import com.reported.rarrier.model.ensure.SectionName;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author: cdy
 * @Date: 2019/2/26 15:27
 * @Version 1.0
 */
public interface SectionNameMapper extends Mapper<SectionName> {
    SectionName selectIdForName(@Param("name") String name);
}
