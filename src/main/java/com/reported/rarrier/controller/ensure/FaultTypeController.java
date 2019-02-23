package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.FaultTypeBiz;
import com.reported.rarrier.model.ensure.FaultType;
import com.reported.rarrier.util.BaseController;
import com.reported.rarrier.util.ObjectRestResponse;
import com.reported.rarrier.util.Query;
import com.reported.rarrier.util.TableResultResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: cdy
 * @Date: 2019/2/23 13:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/ensure/faultType")
public class FaultTypeController extends BaseController<FaultTypeBiz,FaultType> {

    @GetMapping(value = "/selectVfault/all")
    public ObjectRestResponse selectVfaultAll(){
        ObjectRestResponse objectRestResponse = new ObjectRestResponse();
        objectRestResponse.data(baseBiz.selectVfault());
        objectRestResponse.rel(true);
        return objectRestResponse;
    }

    @RequestMapping(value = "/selectVfault/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse selectVfaultPage(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        return baseBiz.selectVfaultPage(query);
    }
}
