package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.HZStateBiz;
import com.reported.rarrier.model.ensure.HZState;
import com.reported.rarrier.util.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cdy
 * @Date: 2019/2/23 14:03
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/ensure/hzstate")
public class HZStateController extends BaseController<HZStateBiz,HZState> {
}
