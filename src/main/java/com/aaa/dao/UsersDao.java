package com.aaa.dao;

import com.aaa.entity.Users;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UsersDao {
    public Users querypwd(@Param("name") String name,@Param("pwd") String pwd);
}
