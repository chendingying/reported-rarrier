package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.ApplyBiz;
import com.reported.rarrier.controller.base.ApplyBaseController;
import com.reported.rarrier.model.ensure.Apply;
import com.reported.rarrier.model.ensure.VApply;
import com.reported.rarrier.model.request.UpdateApplyRequest;
import com.reported.rarrier.util.ObjectRestResponse;
import com.reported.rarrier.util.Query;
import com.reported.rarrier.util.TableResultResponse;
import com.reported.rarrier.vo.Upload;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;

import java.io.IOException;
import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
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

    @Autowired
    Upload upload;

    //明细
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<Apply> get(@RequestParam Map<String, Object> params){
        ObjectRestResponse<Apply> entityObjectRestResponse = new ObjectRestResponse<>();
        if(params.get("applyId") != null && !params.get("applyId").equals("")){
            Apply o = baseBiz.selectByApplyId(params.get("applyId").toString());
            entityObjectRestResponse.data((Apply)o);
        }if(params.get("ApplyId") != null && !params.get("ApplyId").equals("")){
            Apply o = baseBiz.selectByApplyId(params.get("ApplyId").toString());
            entityObjectRestResponse.data((Apply)o);
        }
        return entityObjectRestResponse;
    }

    // 分页查询
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Apply> list(@RequestParam Map<String, Object> params) throws ParseException {
        if(params.get("_") != null){
            params.remove("_");
        }
        //查询列表数据
        Query query = new Query(params);
        return baseBiz.selectByQuery(query);
    }

    //查询所有
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<VApply> all(@RequestParam Map<String, Object> params){
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date applyDateBegin = null;
        Date applyDateEnd = null;
        String applyId = null;
        try{
            if(params.get("ApplyId") != null){
                applyId = params.get("ApplyId").toString();
            }if(params.get("applyId") != null){
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

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse<Apply> add(@RequestParam("file") MultipartFile file,@RequestParam("apply") String stringApply) throws IOException {
        //将字符串转json格式
        JSONObject jsStr = JSONObject.fromObject(stringApply);
        Apply apply = (Apply) JSONObject.toBean(jsStr,Apply.class);
        upload.uploadFile(file,apply);
        return new ObjectRestResponse<Apply>();
    }

    @RequestMapping(value = "/countApply/{solutionFlag}",method = RequestMethod.GET)
    public ObjectRestResponse<Integer> countApply(@PathVariable("solutionFlag") Integer SolutionFlag){
        ObjectRestResponse<Integer> entityObjectRestResponse = new ObjectRestResponse<>();
        entityObjectRestResponse.data((Integer) baseBiz.countApply(SolutionFlag));
        entityObjectRestResponse.rel(true);
        return entityObjectRestResponse;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse<Apply> update(@PathVariable("id") String id,@RequestBody Map<String,Object> entity) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Apply apply = baseBiz.selectByApplyId(id);
        if(entity.get("solutionFlag") != null){
            apply.setSolutionFlag(Integer.valueOf(entity.get("solutionFlag").toString()));
        }if(entity.get("feedBackType") != null){
            apply.setFeedBackType(entity.get("feedBackType").toString());
        }if(entity.get("feedBackNote") != null){
            apply.setFeedBackNote(entity.get("feedBackNote").toString());
        }if(entity.get("fBLogon_Name") != null){
            apply.setfBLogon_Name(entity.get("fBLogon_Name").toString());
        }if(entity.get("fBDisplayName") != null){
            apply.setfBDisplayName(entity.get("fBDisplayName").toString());
        }if(entity.get("fBDate") != null){
            apply.setfBDate(sdf.parse(entity.get("fBDate").toString()));
        }if(entity.get("sLLogon_Name") != null){
            apply.setsLLogon_Name(entity.get("sLLogon_Name").toString());
        }if(entity.get("sLDisplayName") != null){
            apply.setsLDisplayName(entity.get("sLDisplayName").toString());
        }if(entity.get("sLDate") != null){
            apply.setsLDate(sdf.parse(entity.get("sLDate").toString()));
        }if(entity.get("cLDate") != null){
            apply.setcLDate(sdf.parse( entity.get("cLDate").toString()));
        }
        baseBiz.updateSelectiveById(apply);
        ObjectRestResponse objectRestResponse = new ObjectRestResponse<Apply>();
        objectRestResponse.rel(true);
        return objectRestResponse;
    }


}
