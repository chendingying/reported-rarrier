package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.SectionNameBiz;
import com.reported.rarrier.model.ensure.SectionName;
import com.reported.rarrier.util.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cdy
 * @Date: 2019/2/26 15:27
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/ensure/sectionName")
public class SectionNameController extends BaseController<SectionNameBiz,SectionName> {
}
