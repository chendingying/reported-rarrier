package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.EquipNameBiz;
import com.reported.rarrier.biz.ensure.SolutionBiz;
import com.reported.rarrier.model.ensure.EquipName;
import com.reported.rarrier.model.ensure.Solution;
import com.reported.rarrier.util.BaseController;
import com.reported.rarrier.util.ObjectRestResponse;
import com.reported.rarrier.util.Query;
import com.reported.rarrier.util.TableResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by CDZ on 2018/12/13.
 */
@RestController
@RequestMapping("/api/ensure/solution")
public class SolutionController  {

    @Autowired
    SolutionBiz baseBiz;

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Solution> list(@RequestParam Map<String, Object> params){
        if(params.get("_") != null){
            params.remove("_");
        }
        //查询列表数据
        Query query = new Query(params);
        return baseBiz.selectByQuery(query);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse<Solution> add(@RequestBody Solution entity){
        baseBiz.insertSelective(entity);
        return new ObjectRestResponse<Solution>();
    }

    @RequestMapping(value = "/{applyId}",method = RequestMethod.GET)
    @ResponseBody
    public List<Solution> get(@PathVariable String applyId){
        ObjectRestResponse<Solution> entityObjectRestResponse = new ObjectRestResponse<>();
        List<Solution> solutionList = baseBiz.selectSolutionByApplyId(applyId);
        return solutionList;
    }

    @RequestMapping(value = "/{applyId}",method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse<Solution> update(@RequestBody Solution entity){
        ObjectRestResponse objectRestResponse = new ObjectRestResponse<Solution>();
        Integer type = baseBiz.updateSelectiveById(entity);
        if(type == 1){
            objectRestResponse.rel(true);
        }
        return objectRestResponse;
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse<Solution> remove(@PathVariable int id){
        Integer type = baseBiz.deleteById(id);
        ObjectRestResponse objectRestResponse = new ObjectRestResponse<Solution>();
        if(type == 1){
            objectRestResponse.rel(true);
        }
        return new ObjectRestResponse<Solution>();
    }
}
