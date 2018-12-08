package com.reported.rarrier.mapper.ensure;

import com.reported.rarrier.model.ensure.Apply;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by CDZ on 2018/12/7.
 */
public interface ApplyMapper extends Mapper<Apply> {
    Apply selectByApplyId(@Param("applyId") String applyId);
}
