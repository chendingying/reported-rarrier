package com.reported.rarrier.mapper.ensure;

import com.reported.rarrier.model.ensure.FaultType;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: cdy
 * @Date: 2019/2/23 13:28
 * @Version 1.0
 */
public interface FaultTypeMapper extends Mapper<FaultType> {
    List<Map<String,Object>> selectVfault();
}
