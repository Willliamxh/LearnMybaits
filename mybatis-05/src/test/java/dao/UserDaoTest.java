package dao;

import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybaitsUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import java.util.HashMap;
import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-04-18 10:28
 */
public class UserDaoTest {

    @Test
    public void getUsers(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUsers();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    public void addUser(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int hello = mapper.addUser(new User(9, "hello", "123456"));
        System.out.println(hello);
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int hello = mapper.updateUser(new User(5, "haha", "123456"));
        System.out.println(hello);
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int hello = mapper.deleteUser(9);
        System.out.println(hello);
        sqlSession.close();
    }

    @Test
    public void test(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(5,"hello","123123"));



//        List<User> users=mapper.getUsers();
//
//        for (User user : users) {
//            System.out.println(user);
//
//        }


        sqlSession.close();
    }


//    static Logger logger = Logger.getLogger(UserDaoTest.class);
//
//    @Test
//    public void getUserByRowBounds(){
//        SqlSession sqlSession = MybaitsUtils.getSqlSession();
////RowBounds实现
//        RowBounds rowBounds = new RowBounds(1, 2);
////通过Java代码层面实现分页
//        List<User> userList = sqlSession.selectList("com.kuang.dao.UserMapper.getUserByRowBounds",null,rowBounds);
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        sqlSession.close();
//    }
//
//
//
//    @Test
//    public void getUserByLimit(){
//        SqlSession sqlSession = MybaitsUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//
//        map.put("startIndex",1);//注意这边的string要对应
//        map.put("pageSize",2);
//
//        List<User> userByLimit = mapper.getUserByLimit(map);
//
//        for (User user : userByLimit) {
//
//            System.out.println(user);
//
//        }
//
//
//
//        sqlSession.close();
//    }
//
//
//
//
//    @Test
//    public void testLog4j(){
//        logger.info("info:进入了testLog4j");
//        logger.debug("debug:进入了testLog4j");
//        logger.error("error:进入了testLog4j");
//    }
//
//
//    @Test
//    public void delete(){
//        SqlSession sqlSession = MybaitsUtils.getSqlSession();
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//        mapper.deleteUser(4);
//
//        sqlSession.commit();
//
//
//        sqlSession.close();
//
//    }
//
//    @Test
//    public void update()
//    {
//
//        SqlSession sqlSession = MybaitsUtils.getSqlSession();
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//        int res = mapper.updateUser(new User(4, "呵呵", "123123123"));
//        System.out.println(res);
//        sqlSession.commit();
//
//
//        sqlSession.close();
//
//
//    }
//
//
//
//    //增删改必须要需要提交事务
//    @Test
//    public void addUser(){
//        SqlSession sqlSession = MybaitsUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//        int res=mapper.addUser(new User(4,"哈哈","123123"));
//        if(res>0)
//        {
//            System.out.println("插入成功的条数"+res);
//        }
//
//        //提交事务
//
//        sqlSession.commit();
//
//        sqlSession.close();
//    }
//
//
//
//
//
//    @Test
//    public void getUserById(){
//
//        SqlSession sqlSession = MybaitsUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.getUserById(2);
//        System.out.println(user);
//        sqlSession.close();
////         select * from mybatis.user where id = #{id};
//        //类型处理器找不到pwd
////         select id,name,pwd from mybatis.user where id = #{id}; 我们这边没有pwd了
//        //         select id,name,pwd as password from mybatis.user where id = #{id}; 我们这边没有pwd了
//    }
//
//
//
//
//
//    @Test
//    public void test(){
//        SqlSession sqlSession=null;
//        try {
//            //第一步 获得sqlSession对象
//            sqlSession = MybaitsUtils.getSqlSession();
//
////        //方式一 getMapper
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            List<User> userList = mapper.getUserList();
//
//
//            //方式二：不推荐使用
////        List<User> userList = sqlSession.selectList("com.kuang.dao.UserDao.getUserList");
////
//        for (User user : userList) {
//            System.out.println(user);
//        }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            //关闭sqlsession
//            sqlSession.close();
//        }
//
//
//    }
}
