import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MybaitsUtils;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author Willam_xh
 * @create 2021-04-29 15:01
 */
public class MyTest {

    @Test
    public void addInitBlog(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        sqlSession.close();


    }


    @Test
    public void queryBlohIF()
    {
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);


        HashMap hashMap = new HashMap();
//        hashMap.put("title","Java如此简单");
        hashMap.put("author","狂神说");

        List<Blog> blogs = mapper.queryBlogIF(hashMap);

        for (Blog blog : blogs) {
            System.out.println(blog);

        }


        sqlSession.close();

    }

    @Test
    public void queryChoose()
    {
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);


        HashMap hashMap = new HashMap();
        hashMap.put("title","Java如此简单");
        hashMap.put("author","狂神说");

        List<Blog> blogs = mapper.queryBlogChoose(hashMap);

        for (Blog blog : blogs) {
            System.out.println(blog);

        }


        sqlSession.close();

    }

    @Test
    public void querySet()
    {
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);


        HashMap hashMap = new HashMap();
        hashMap.put("title","Java如此简单2");
        hashMap.put("author","狂神说");
        hashMap.put("id","5f51d5ffc7014dbb9a50f31fa2b402ee");

        mapper.updateBlog(hashMap);

//        for (Blog blog : blogs) {
//            System.out.println(blog);
//
//        }


        sqlSession.close();

    }


    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
//        ids.add(3);


        map.put("ids",ids);
        mapper.  queryBlogForeach(map);
        sqlSession.close();
    }




}
