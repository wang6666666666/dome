package com.aaa.dao;

import com.aaa.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {
    //    当使用${}时必须加上@Param("ename")
    public List<Emp> querys(@Param("ename") String ename);

    public int add(Emp emp);

    public int delete(Integer empno);

    public int update(Emp emp);

    public List<Emp> queryid(Integer empno);

    public int dels(Integer[] empno);
}
