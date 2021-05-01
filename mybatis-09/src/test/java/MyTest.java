import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Willam_xh
 * @create 2021-04-29 20:56
 */
public class MyTest {

    @Test
    public void test()
    {
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        User userById = mapper.getUserById(1);
        System.out.println(userById);


        mapper.updateUser(new User(2,"aaa","123213"));


        User userById2 = mapper.getUserById(1);
        System.out.println(userById2);

        sqlSession.close();
    }



    @Test
    public void test2()
    {
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        SqlSession sqlSession2 = MybaitsUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);


        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();


        User userById2 = mapper2.getUserById(1);
        System.out.println(userById2);

//        这边调用了一级和二级缓存 所以其实这两个是一样的

        System.out.println(userById==userById2);






        sqlSession2.close();
    }


}
