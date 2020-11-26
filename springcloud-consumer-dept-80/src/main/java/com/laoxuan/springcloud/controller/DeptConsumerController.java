package com.laoxuan.springcloud.controller;

import com.laoxuan.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
public class DeptConsumerController {
    //消费者不应该有service层
    //RestTemplate.. 供我们直接调用就可以了！ 注册到spring中
    //(url,实体：Map，Class<T> responseType)
    @Autowired
    private RestTemplate restTemplate;


    private static final String REST_URL_PREFIX = "http://localhost:8001";

//    @RequestMapping("/consumer/dept/add")
//    public boolean add(Dept dept){
//        return  restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept,Boolean.class);
//    }

    //想要获取远程信息要从http:8001/dept/list上面获取
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return  restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

//    @RequestMapping("/consumer/dept/list")
//    public List<Dept> list(){
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class); }
}
