package com.reported.rarrier.mapper.ensure;

import com.reported.rarrier.model.ensure.Solution;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by CDZ on 2018/12/13.
 */
public interface SolutionMapper  extends Mapper<Solution> {
   List<Solution> selectSolutionByApplyId(@Param("applyId") String applyId);
}
