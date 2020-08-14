package com.aaa.controller;

import com.aaa.entity.Stus;
import com.aaa.service.StusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/stus")
public class StusController {
    @Resource
    StusService service;

    @RequestMapping(value="/selectAll",method = RequestMethod.POST)
    @ResponseBody
    public List<Stus> selectAll(){
        List<Stus> stus=service.selectAll();
//        System.out.println(stus);
        return stus;
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public int add(@RequestBody Stus stus){
        System.out.println("s:"+stus);
        int count=service.add(stus);
        return count;
    }

    @RequestMapping(value="/delete",method = RequestMethod.POST)
    @ResponseBody
    public int delete(Integer id){
        int count=service.delete(id);
        return count;
    }

    @RequestMapping(value="/update",method = RequestMethod.POST)
    @ResponseBody
    public int update(Stus s){
        int count=service.update(s);
        return count;
    }
}
