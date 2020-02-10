package com.hezhe.microservicecloud;

import com.hezhe.microservicecloud.mapper.DeptMapper;
import com.hezhe.microservicecloud.model.Dept;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-10 12:00
 */
@SpringBootTest
public class microservicecloudTest {

    @Autowired
    DeptMapper deptMapper;

    @Test
    public void microserviceTest() {
        List<Dept> deptList = deptMapper.findAll();
        for (Dept dept : deptList) {
            System.out.println(dept);
        }
    }
}
