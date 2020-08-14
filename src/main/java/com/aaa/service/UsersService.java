package com.aaa.service;

import com.aaa.dao.UsersDao;
import com.aaa.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersService {
    @Resource
    UsersDao dao;


    public Users querypwd(String name,String pwd){
        Users list =  dao.querypwd(name,pwd);
        System.out.println(list);
        return list;
    }
}
