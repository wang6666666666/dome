package com.aaa.service;

import com.aaa.dao.EmpDao;
import com.aaa.entity.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpService {
    @Resource
    EmpDao dao;

    public List<Emp> querys(String ename){
        List<Emp> emps = dao.querys(ename);
        return emps;
    }

    public int add(Emp emp){
        return dao.add(emp);
    }

    public int delete(Integer empno){
        return dao.delete(empno);
    }

    public int update(Emp emp){
        return dao.update(emp);
    }

    public List<Emp> queryid(Integer empno){
        return dao.queryid(empno);
    }

    public int dels(Integer[] empno){
        return dao.dels(empno);
    }
}
