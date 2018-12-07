package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.ApplyBiz;
import com.reported.rarrier.model.ensure.Apply;
import com.reported.rarrier.util.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CDZ on 2018/12/7.
 */
@RestController
@RequestMapping("/api/ensure/apply")
public class ApplyController extends BaseController<ApplyBiz,Apply> {
}
