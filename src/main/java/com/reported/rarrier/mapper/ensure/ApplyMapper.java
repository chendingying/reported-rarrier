package com.reported.rarrier.mapper.ensure;

import com.reported.rarrier.model.ensure.Apply;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by CDZ on 2018/12/7.
 */
public interface ApplyMapper extends Mapper<Apply> {
    Apply selectByApplyId(@Param("applyId") String applyId);
    Integer countApply(@Param("SolutionFlag") Integer SolutionFlag);
    List<Map<String,Object>> countField(@Param("sType") String sType, @Param("BeginTime") Date beginTime, @Param("EndTime") Date endTime);
}
