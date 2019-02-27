package com.reported.rarrier.mapper.ensure;

import com.reported.rarrier.model.ensure.Pass;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author: cdy
 * @Date: 2019/2/27 11:52
 * @Version 1.0
 */
public interface PassMapper extends Mapper<Pass> {
        List<Pass> selectPassForApplyId(@Param("applyId") Integer applyId);
}
