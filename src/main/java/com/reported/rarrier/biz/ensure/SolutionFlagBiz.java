package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.SolutionFlagMapper;
import com.reported.rarrier.model.ensure.SolutionFlag;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by CDZ on 2018/12/8.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SolutionFlagBiz extends BaseBiz<SolutionFlagMapper,SolutionFlag> {
}
