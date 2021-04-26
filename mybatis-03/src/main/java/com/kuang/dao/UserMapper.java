package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author Willam_xh
 * @create 2021-04-18 10:19
 */
public interface UserMapper {



    //查询全部的用户
    List<User> getUserList();


    //根据id 查询用户
    User getUserById(int id);


    //insert 一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);


    //删除一个用户
    int deleteUser(int id);




}
