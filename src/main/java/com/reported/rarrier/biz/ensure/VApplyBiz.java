package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.VApplyMapper;
import com.reported.rarrier.model.ensure.VApply;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by CDZ on 2018/12/10.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class VApplyBiz extends BaseBiz<VApplyMapper,VApply> {
    public List<VApply> selectVApplyAll(Date applyDateBegin, Date applyDateEnd,String applyId){
        return mapper.selectVApplyAll(applyDateBegin,applyDateEnd,applyId);
    }

}
