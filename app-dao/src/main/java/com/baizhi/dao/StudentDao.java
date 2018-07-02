package com.baizhi.dao;

import com.baizhi.entity.Student;

import java.util.List;

/**
 * Created by 陈少 on 2018/7/1.
 */
public interface StudentDao {

    public List<Student> selectAll();

    public Student selectById(Integer id);

    public void update(Student student);

    public void insert(Student student);

    public void delete(Integer id);

    public Student selectByName(String name);
    
    public void m1();
}
