package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.PassBiz;
import com.reported.rarrier.model.ensure.Pass;
import com.reported.rarrier.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: cdy
 * @Date: 2019/2/27 11:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/ensure/pass")
public class PassController {
    @Autowired
    protected PassBiz baseBiz;

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse<Pass> add(@RequestBody Pass entity){
        baseBiz.insertPass(entity);
        return new ObjectRestResponse<Pass>();
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<Pass> all(){
        return baseBiz.selectListAll();
    }
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Pass> list(@RequestParam Map<String, Object> params){
        if(params.get("_") != null){
            params.remove("_");
        }
        //查询列表数据
        Query query = new Query(params);
        return baseBiz.selectByQuery(query);
    }
    public String getCurrentUserName(){
        return BaseContextHandler.getUsername();
    }

}
