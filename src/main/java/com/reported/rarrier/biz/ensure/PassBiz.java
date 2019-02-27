package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.PassMapper;
import com.reported.rarrier.model.ensure.Pass;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;

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
}
