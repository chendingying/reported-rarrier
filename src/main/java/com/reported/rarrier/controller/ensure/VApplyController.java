package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.VApplyBiz;
import com.reported.rarrier.model.ensure.VApply;
import com.reported.rarrier.util.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CDZ on 2018/12/10.
 */
@RestController
@RequestMapping("/api/ensure/Aapply")
public class VApplyController extends BaseController<VApplyBiz,VApply> {
}
