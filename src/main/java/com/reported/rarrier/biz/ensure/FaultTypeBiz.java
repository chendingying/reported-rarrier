package com.reported.rarrier.biz.ensure;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.reported.rarrier.mapper.ensure.FaultTypeMapper;
import com.reported.rarrier.model.ensure.FaultType;
import com.reported.rarrier.util.BaseBiz;
import com.reported.rarrier.util.Query;
import com.reported.rarrier.util.TableResultResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: cdy
 * @Date: 2019/2/23 13:28
 * @Version 1.0
 */
@Service
public class FaultTypeBiz extends BaseBiz<FaultTypeMapper,FaultType> {

    public List<Map<String,Object>> selectVfault(){
        return mapper.selectVfault();
    }

    public TableResultResponse selectVfaultPage(Query query){
        Page<Object> result = PageHelper.startPage(query.getPage(), query.getLimit());
        List<Map<String,Object>> list = mapper.selectVfault();
        return new TableResultResponse(result.getTotal(), list);
    }
}
