package com.hezhe.microservicecloud.mapper;

import com.hezhe.microservicecloud.model.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 贺哲
 * @2020-02-10 11:25
 */
@Repository("deptMapper")
public interface DeptMapper {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
