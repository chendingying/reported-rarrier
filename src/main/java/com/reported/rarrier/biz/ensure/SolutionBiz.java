package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.EquipNameMapper;
import com.reported.rarrier.mapper.ensure.SolutionMapper;
import com.reported.rarrier.model.ensure.EquipName;
import com.reported.rarrier.model.ensure.Solution;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by CDZ on 2018/12/13.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SolutionBiz extends BaseBiz<SolutionMapper,Solution> {
}
