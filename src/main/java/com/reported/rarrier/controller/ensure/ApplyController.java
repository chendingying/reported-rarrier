package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.ApplyBiz;
import com.reported.rarrier.model.ensure.Apply;
import com.reported.rarrier.util.BaseController;
import com.reported.rarrier.util.ObjectRestResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by CDZ on 2018/12/7.
 */
@RestController
@RequestMapping("/api/ensure/apply")
public class ApplyController extends BaseController<ApplyBiz,Apply> {

    //带参数查询
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<Apply> get(@RequestParam Map<String, Object> params){
        ObjectRestResponse<Apply> entityObjectRestResponse = new ObjectRestResponse<>();
        if(params.get("applyId") != null && !params.get("applyId").equals("")){
            Apply o = baseBiz.selectByApplyId(params.get("applyId").toString());
            entityObjectRestResponse.data((Apply)o);
        }
        return entityObjectRestResponse;
    }
}
