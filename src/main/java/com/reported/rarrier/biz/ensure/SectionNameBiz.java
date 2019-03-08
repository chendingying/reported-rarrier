package com.reported.rarrier.biz.ensure;

import com.reported.rarrier.mapper.ensure.SectionNameMapper;
import com.reported.rarrier.model.ensure.SectionName;
import com.reported.rarrier.util.BaseBiz;
import org.springframework.stereotype.Service;

/**
 * @Author: cdy
 * @Date: 2019/2/26 15:27
 * @Version 1.0
 */
@Service
public class SectionNameBiz extends BaseBiz<SectionNameMapper,SectionName>{

    public SectionName selectIdForName(String name){
        return mapper.selectIdForName(name);
    }
}
