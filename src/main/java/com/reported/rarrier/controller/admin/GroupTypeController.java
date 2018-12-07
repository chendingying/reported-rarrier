package com.reported.rarrier.controller.admin;

import com.reported.rarrier.biz.admin.GroupTypeBiz;
import com.reported.rarrier.model.admin.GroupType;
import com.reported.rarrier.util.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-08 11:51
 */
@Controller
@RequestMapping("/api/admin/groupType")
public class GroupTypeController extends BaseController<GroupTypeBiz, GroupType> {
}
