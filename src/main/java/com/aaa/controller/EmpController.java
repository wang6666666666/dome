package com.aaa.controller;

import com.aaa.entity.Emp;
import com.aaa.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/emp")
public class EmpController {
    @Resource
    EmpService service;

    @RequestMapping("/querys")
    @ResponseBody
    public List<Emp> querys(String ename){
        List<Emp> querys = service.querys(ename);
        return querys;
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public int add(@RequestBody Emp emp){
        System.out.println("员工："+emp);
        int count = service.add(emp);
        System.out.println("添加了"+count+"条数据");
        return count;
    }

    @RequestMapping(value="/delete",method = RequestMethod.POST)
    @ResponseBody
    public int delete(@RequestBody Emp emp){
        return service.delete(emp.getId());
    }

    @RequestMapping(value="/update",method = RequestMethod.POST)
    @ResponseBody
    public int update(@RequestBody Emp emp){
        System.out.println("emp"+emp);
        int count = service.update(emp);
        System.out.println("修改了"+count+"条数据");
        return count;
    }

    @RequestMapping(value="/queryid",method = RequestMethod.GET)
    @ResponseBody
    public List<Emp> queryid(Integer empno){
        List<Emp> queryid = service.queryid(empno);
        return queryid;
    }

    @RequestMapping(value="/dels",method = RequestMethod.GET)
    @ResponseBody
    public int dels(@RequestParam Integer[] empno){
        int count = service.dels(empno);
        System.out.println("成功删除了"+count+"条数据");
        return count;
    }
}
