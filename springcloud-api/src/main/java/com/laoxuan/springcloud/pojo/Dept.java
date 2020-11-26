package com.laoxuan.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
//定义实体类，网络通信需要序列化
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Dept implements Serializable {

    private  Long deptno;//主键
    private  String  dename;
    //数据存在哪个数据库
    private String db_sources;


/*
*   链式写法
 *  dept.set().set().set();
  * */


}
