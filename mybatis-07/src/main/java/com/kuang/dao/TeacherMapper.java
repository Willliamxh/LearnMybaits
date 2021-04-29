package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-04-27 15:31
 */
public interface TeacherMapper {

//    @Select("select * from teacher where id = #{tid}")
//    Teacher getTeacher(@Param("tid") int id);

//    List<Teacher> getTeacher();


    //获取指定老师下的所有的学生以及老师的信息
    Teacher getTeacher(@Param("tid") int id);

    //获取指定老师下的所有的学生以及老师的信息
    Teacher getTeacher2(@Param("tid") int id);




}
