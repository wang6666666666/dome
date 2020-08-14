package com.aaa.service;

import com.aaa.dao.StusDao;
import com.aaa.entity.Stus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StusService {
    @Resource
    StusDao dao;

    public int add(Stus s){
        return dao.insert(s);
    }

    public int delete(Integer id){
        return dao.deleteByPrimaryKey(id);
    }

    public int update(Stus s){
        return dao.updateByPrimaryKey(s);
    }

    public List<Stus> selectAll(){
        return dao.selectAll();
    }
}
