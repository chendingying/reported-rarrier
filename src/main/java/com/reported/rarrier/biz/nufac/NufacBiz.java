package com.reported.rarrier.biz.nufac;

import com.reported.rarrier.mapper.nufac.NufacMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: cdy
 * @Date: 2019/2/26 14:52
 * @Version 1.0
 */
@Service
public class NufacBiz {
    @Autowired
    private NufacMapper mapper;

    public List<Map<String,Object>> selectNufac(String nufac){
        return mapper.selectNufac(nufac);
    }
}
