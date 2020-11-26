package com.laoxuan.springcloud.controller;

import com.laoxuan.springcloud.pojo.Dept;
import com.laoxuan.springcloud.service.DeptService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//提供Restful服务,是mvc的升级，和mvc抽象不同，restful是具体的通过url来达到访问的目的
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @PostMapping("/dept/add")
    public  boolean addDept(Dept dept){
        return  deptService.addDept(dept);
    }



    @GetMapping("/dept/get/{id}")
    //PathVariable可以用来映射URL中的占位符到目标方法的参数中
    public  Dept get(@PathVariable("id") Long id){
        return  deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public  List<Dept> queryAll(){
        return  deptService.queryAll();
    }

}
