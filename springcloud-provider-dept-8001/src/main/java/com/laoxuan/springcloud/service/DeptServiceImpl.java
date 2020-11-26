package com.laoxuan.springcloud.service;

import com.laoxuan.springcloud.pojo.Dept;
import com.laoxuan.springcloud.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//该注解可以自动把类加载到spring容器当中，但是必须要在applicationContext.xml中开启注解扫描才可以
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }
    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }


}
