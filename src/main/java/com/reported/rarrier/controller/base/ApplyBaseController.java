package com.reported.rarrier.controller.base;

import com.reported.rarrier.biz.ensure.VApplyBiz;
import com.reported.rarrier.model.ensure.VApply;
import com.reported.rarrier.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by CDZ on 2018/12/10.
 */
@Slf4j
public class ApplyBaseController<Biz extends BaseBiz,Entity>  {
    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected Biz baseBiz;
    @Autowired
    protected VApplyBiz vApplyBiz;


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<Entity> get(@PathVariable int id){
        ObjectRestResponse<Entity> entityObjectRestResponse = new ObjectRestResponse<>();
        Object o = baseBiz.selectById(id);
        entityObjectRestResponse.data((Entity)o);
        return entityObjectRestResponse;
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse<Entity> remove(@PathVariable int id){
        Integer type =  baseBiz.deleteById(id);
        ObjectRestResponse objectRestResponse = new ObjectRestResponse<Entity>();
        if(type == 1){
            objectRestResponse.rel(true);
        }
        return objectRestResponse;
    }

    public String getCurrentUserName(){
        return BaseContextHandler.getUsername();
    }
}
