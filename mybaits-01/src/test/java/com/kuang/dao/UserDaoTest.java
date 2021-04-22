package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-04-18 10:28
 */
public class UserDaoTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //1.java代码执行的时候 传递通配符 %%
        List<User> userList = mapper.getUserLike("%李%");
        //会存在sql注入


        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.commit();


        sqlSession.close();
    }


    @Test
    public void delete(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(4);

        sqlSession.commit();


        sqlSession.close();

    }

    @Test
    public void update()
    {

        SqlSession sqlSession = MybaitsUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.updateUser(new User(4, "呵呵", "123123123"));
        System.out.println(res);
        sqlSession.commit();


        sqlSession.close();


    }



    //增删改必须要需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res=mapper.addUser(new User(4,"哈哈","123123"));
        if(res>0)
        {
            System.out.println("插入成功的条数"+res);
        }

        //提交事务

        sqlSession.commit();

        sqlSession.close();
    }


    @Test
    public void addUser2(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Object> map=new HashMap<String, Object>();

        map.put("userid",5);
        map.put("userName","hhhhh");
        map.put("password","123123");


        int res=mapper.addUser2(map);
        if(res>0)
        {
            System.out.println("插入成功的条数"+res);
        }

        //提交事务

        sqlSession.commit();

        sqlSession.close();

    }



    @Test
    public void getUserById(){

        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }


    @Test
    public void getUserById2(){

        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String,Object> map=new HashMap<String, Object>();

        map.put("id",2);
        map.put("name","张三");
        map.put("password","123123");



        User user = mapper.getUserById2(map);
        System.out.println(user);
        sqlSession.close();
    }


    @Test
    public void test(){
        SqlSession sqlSession=null;
        try {
            //第一步 获得sqlSession对象
            sqlSession = MybaitsUtils.getSqlSession();

//        //方式一 getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();


            //方式二：不推荐使用
//        List<User> userList = sqlSession.selectList("com.kuang.dao.UserDao.getUserList");
//
        for (User user : userList) {
            System.out.println(user);
        }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭sqlsession
            sqlSession.close();
        }


    }
}
