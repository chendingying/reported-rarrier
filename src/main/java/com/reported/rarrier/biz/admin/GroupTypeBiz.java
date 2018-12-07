package com.reported.rarrier.biz.admin;

import com.reported.rarrier.mapper.admin.GroupTypeMapper;
import com.reported.rarrier.model.admin.GroupType;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author cdy
 * @create 2017-06-12 8:48
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper,GroupType> {
}
