package com.kuang.pojo;

import lombok.Data;

/**
 * @author Willam_xh
 * @create 2021-04-27 15:28
 */

@Data
public class Student {
    private int id;
    private String name;

    //学生需要冠梁一个老师
    private Teacher teacher;



}
