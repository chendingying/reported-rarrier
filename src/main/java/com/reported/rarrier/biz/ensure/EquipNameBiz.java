package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.EquipNameMapper;
import com.reported.rarrier.model.ensure.EquipName;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by CDZ on 2018/12/8.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EquipNameBiz extends BaseBiz<EquipNameMapper,EquipName> {
}
