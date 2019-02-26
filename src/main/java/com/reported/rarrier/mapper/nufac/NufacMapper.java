package com.reported.rarrier.mapper.nufac;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: cdy
 * @Date: 2019/2/26 14:35
 * @Version 1.0
 */
public interface NufacMapper {
    List<Map<String,Object>> selectNufac(@Param("asNum") String asNum);
}
