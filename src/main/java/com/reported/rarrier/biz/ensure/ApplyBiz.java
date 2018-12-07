package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.ApplyMapper;
import com.reported.rarrier.model.ensure.Apply;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by CDZ on 2018/12/7.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ApplyBiz extends BaseBiz<ApplyMapper,Apply> {
}
