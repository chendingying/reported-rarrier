package com.reported.rarrier.controller.nufac;

import com.reported.rarrier.biz.nufac.NufacBiz;
import com.reported.rarrier.util.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: cdy
 * @Date: 2019/2/26 14:56
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/nufac")
public class NufacController {
    @Autowired
    NufacBiz nufacBiz;

    @RequestMapping(value = "/select/{nufac}",method = RequestMethod.GET)
    public ObjectRestResponse selectNufac(@PathVariable("nufac") String nufac){
        ObjectRestResponse objectRestResponse = new ObjectRestResponse();
        List<Map<String,Object>> mapList = nufacBiz.selectNufac(nufac);
        if(mapList.size() == 0){
            objectRestResponse.rel(false);
            objectRestResponse.setMessage("无数据");
        }else{
            objectRestResponse.setRel(true);
        }
        objectRestResponse.setData(mapList);
        return objectRestResponse;
    }
}
