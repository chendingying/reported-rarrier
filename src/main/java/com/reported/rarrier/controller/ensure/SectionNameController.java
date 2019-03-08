package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.SectionNameBiz;
import com.reported.rarrier.model.ensure.SectionName;
import com.reported.rarrier.util.BaseController;
import com.reported.rarrier.util.ObjectRestResponse;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: cdy
 * @Date: 2019/2/26 15:27
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/ensure/sectionName")
public class SectionNameController extends BaseController<SectionNameBiz,SectionName> {

    @RequestMapping(value = "/selectIdForName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse selectIdForName(@PathVariable("name") String name){
        SectionName sectionName = baseBiz.selectIdForName(name);
        ObjectRestResponse objectRestResponse = new ObjectRestResponse();
        if(sectionName != null){
            objectRestResponse.rel(true);
            objectRestResponse.setData(sectionName);
        }else{
            objectRestResponse.setRel(false);
            objectRestResponse.setMessage("无数据");
        }
        return objectRestResponse;
    }
}
