package com.reported.rarrier.mapper.ensure;

import com.reported.rarrier.model.ensure.Apply;
import com.reported.rarrier.model.ensure.VApply;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

/**
 * Created by CDZ on 2018/12/10.
 */
public interface VApplyMapper extends Mapper<VApply> {
    List<VApply> selectVApplyAll(@Param("applyDateBegin") Date applyDateBegin, @Param("applyDateEnd") Date applyDateEnd,@Param("applyId") String applyId);
}
