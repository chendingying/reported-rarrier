package com.reported.rarrier.biz.ensure;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.reported.rarrier.mapper.ensure.ApplyMapper;
import com.reported.rarrier.model.ensure.Apply;
import com.reported.rarrier.util.BaseBiz;
import com.reported.rarrier.util.Query;
import com.reported.rarrier.util.TableResultResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by CDZ on 2018/12/7.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ApplyBiz extends BaseBiz<ApplyMapper,Apply> {

    public Apply selectByApplyId(String applyId){
      return   mapper.selectByApplyId(applyId);
    }

    public TableResultResponse<Apply> selectByQuery(Query query)  {
        Class<Apply> clazz = (Class<Apply>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        Example example = new Example(clazz);
        if(query.entrySet().size()>0) {
            DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            Date applyDateBegin = null;
            Date applyDateEnd = null;
            Example.Criteria criteria = example.createCriteria();
            for (Map.Entry<String, Object> entry : query.entrySet()) {
                try{

                    if(entry.getKey().equals("applyDateBegin")){
                        applyDateBegin = format1.parse(entry.getValue().toString());
                        continue;
                    }if(entry.getKey().equals("applyDateEnd")){
                        applyDateEnd = format1.parse(entry.getValue().toString());
                        continue;
                    }
                    criteria.andLike(entry.getKey(), "%" + entry.getValue().toString() + "%");
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
            if(applyDateBegin != null && applyDateEnd != null){
                criteria.andBetween("applyDate",applyDateBegin,applyDateEnd);
            }
        }
        Page<Object> result = PageHelper.startPage(query.getPage(), query.getLimit());
        List<Apply> list = mapper.selectByExample(example);
        return new TableResultResponse<Apply>(result.getTotal(), list);
    }
}
