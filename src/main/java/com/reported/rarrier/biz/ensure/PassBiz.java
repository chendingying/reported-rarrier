package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.PassMapper;
import com.reported.rarrier.model.ensure.Apply;
import com.reported.rarrier.model.ensure.Pass;
import com.reported.rarrier.util.BaseBiz;
import com.reported.rarrier.util.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cdy
 * @Date: 2019/2/27 11:52
 * @Version 1.0
 */
@Service
public class PassBiz extends BaseBiz<PassMapper,Pass> {

    @Autowired
    ApplyBiz applyBiz;

    public ObjectRestResponse insertPass(Pass pass){
        ObjectRestResponse objectRestResponse = new ObjectRestResponse();
        int i =  mapper.insertSelective(pass);
        if(i == 0){
            objectRestResponse.rel(false);
            objectRestResponse.setMessage("添加pass表失效");
            return objectRestResponse;
        }
        Apply apply = applyBiz.selectById(pass.getApplyId());
        if(apply == null){
            objectRestResponse.rel(false);
            objectRestResponse.setMessage("查无Apply对象");
            return objectRestResponse;
        }
        apply.setsLTSection(Integer.valueOf(pass.getsLTSection()));
        i =  applyBiz.updateSelectiveById(apply);
        if(i == 0){
            objectRestResponse.rel(false);
            objectRestResponse.setMessage("更新Apply表失效");
            return objectRestResponse;
        }
        objectRestResponse.setRel(true);
        objectRestResponse.setMessage("添加成功");
        return objectRestResponse;
    }

    public ObjectRestResponse selectPassForApplyId(Integer applyId){
        ObjectRestResponse objectRestResponse = new ObjectRestResponse();
        List<Pass> passList = mapper.selectPassForApplyId(applyId);
        if(passList.size() == 0){
            objectRestResponse.setRel(false);
            objectRestResponse.setData(passList);
            objectRestResponse.setMessage("无数据");
        }else{
            objectRestResponse.setData(passList);
            objectRestResponse.setRel(true);
        }

        return objectRestResponse;
    }
}
