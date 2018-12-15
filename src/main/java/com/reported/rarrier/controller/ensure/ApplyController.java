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

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse<Apply> add(@RequestParam("file") MultipartFile file,@RequestParam("apply") String stringApply) throws IOException {
        //将字符串转json格式
        JSONObject jsStr = JSONObject.fromObject(stringApply);
        Apply apply = (Apply) JSONObject.toBean(jsStr,Apply.class);
        upload.uploadFile(file,apply);
        return new ObjectRestResponse<Apply>();
    }


}
