package com.reported.rarrier.biz.admin;

import com.reported.rarrier.mapper.admin.ResourceAuthorityMapper;
import com.reported.rarrier.model.admin.ResourceAuthority;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ace on 2017/6/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper, ResourceAuthority> {
}
