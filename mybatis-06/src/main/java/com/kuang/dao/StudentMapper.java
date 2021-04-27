package com.kuang.dao;

import com.kuang.pojo.Student;

import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-04-27 15:31
 */
public interface StudentMapper {

    //查询所有的学生信息，以及对应的老师的信息！
    public List<Student> getStudent();


    public List<Student> getStudent2();



}
