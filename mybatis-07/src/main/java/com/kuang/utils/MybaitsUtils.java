package com.kuang.utils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Willam_xh
 * @create 2021-04-18 9:33
 */
public class MybaitsUtils {

//    String resource = "F:\\WorkLearning\\LearnMybits\\mybaits-01\\src\\main\\resources\\mybatis-config.xml";
//    InputStream inputStream = Resources.getResourceAsStream(resource);
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }

}
