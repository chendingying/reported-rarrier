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

    @RequestMapping(value = "/selectPassForApplyId/{applyId}",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse selectPassForApplyId(@PathVariable("applyId") Integer applyId){
       return baseBiz.selectPassForApplyId(applyId);
    }

}
