package com.reported.rarrier.mapper.admin;



import com.reported.rarrier.model.admin.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper extends Mapper<User> {
    public List<User> selectMemberByGroupId(@Param("groupId") int groupId);
    public List<User> selectLeaderByGroupId(@Param("groupId") int groupId);
    public List<Map<String,Object>> selectUser(@Param("userName") String userName, @Param("name") String name, @Param("phone") String telPhone, @Param("status") Integer status);
}