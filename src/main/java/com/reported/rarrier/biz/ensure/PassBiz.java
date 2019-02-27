package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.PassMapper;
import com.reported.rarrier.model.ensure.Pass;
import com.reported.rarrier.util.BaseBiz;
import com.reported.rarrier.util.ObjectRestResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cdy
 * @Date: 2019/2/27 11:52
 * @Version 1.0
 */
@Service
public class PassBiz extends BaseBiz<PassMapper,Pass> {

    public int insertPass(Pass pass){
       return   mapper.insertSelective(pass);

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
