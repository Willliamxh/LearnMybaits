package com.kuang.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-04-27 15:29
 */
@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}
