package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.ApplyBiz;
import com.reported.rarrier.controller.base.ApplyBaseController;
import com.reported.rarrier.model.ensure.Apply;
import com.reported.rarrier.model.ensure.VApply;
import com.reported.rarrier.util.ObjectRestResponse;
import org.springframework.web.bind.annotation.*;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by CDZ on 2018/12/7.
 */
@RestController
@RequestMapping("/api/ensure/apply")
public class ApplyController extends ApplyBaseController<ApplyBiz,Apply> {

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

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<VApply> all(@RequestParam Map<String, Object> params){
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date applyDateBegin = null;
        Date applyDateEnd = null;
        String applyId = null;
        try{
            if(params.get("applyId") != null){
                applyId = params.get("applyId").toString();
            }
            if(params.get("applyDateBegin") != null){
                applyDateBegin = format1.parse(params.get("applyDateBegin").toString());
            }if(params.get("applyDateEnd") != null){
                applyDateEnd = format1.parse(params.get("applyDateEnd").toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return vApplyBiz.selectVApplyAll(applyDateBegin,applyDateEnd,applyId);
    }
}
