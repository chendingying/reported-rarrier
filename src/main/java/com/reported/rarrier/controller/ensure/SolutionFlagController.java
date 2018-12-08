package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.SolutionFlagBiz;
import com.reported.rarrier.model.ensure.SolutionFlag;
import com.reported.rarrier.util.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CDZ on 2018/12/8.
 */
@RestController
@RequestMapping("/api/ensure/solutionFlag")
public class SolutionFlagController extends BaseController<SolutionFlagBiz,SolutionFlag> {
}
