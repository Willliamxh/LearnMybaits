package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author Willam_xh
 * @create 2021-04-18 10:19
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    // 方法存在多个参数，所有的参数前面必须加上 @Param("id")注解
    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id);


    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);


    @Update("update user set name=#{name},pwd=#{password} where id = #{id}")
    int updateUser(User user);


    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);



//    //分页2
//    List<User> getUserByRowBounds();
//
//
//    List<User> getUserByLimit(Map<String, Integer> map);
//
//    //查询全部的用户
//    List<User> getUserList();
//
//
//    //根据id 查询用户
//    User getUserById(int id);
//
//
//    //insert 一个用户
//    int addUser(User user);
//
//    //修改用户
//    int updateUser(User user);
//
//
//    //删除一个用户
//    int deleteUser(int id);




}
