package com.hezhe.microservicecloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 贺哲
 * @2020-02-09 21:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    //主键
    private Long deptno;
    //部门名称
    private String dname;
    //来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息存储到不同的数据库
    private String dbSource;
}
