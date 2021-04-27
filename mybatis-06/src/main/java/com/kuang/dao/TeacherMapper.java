package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Willam_xh
 * @create 2021-04-27 15:31
 */
public interface TeacherMapper {

    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid")int id);



}
