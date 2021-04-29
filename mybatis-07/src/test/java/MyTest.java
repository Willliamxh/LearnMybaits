import com.kuang.dao.TeacherMapper;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-04-29 10:08
 */
public class MyTest {

    @Test
    public void test()
    {
//        SqlSession sqlSession = MybaitsUtils.getSqlSession();
//        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//
//        List<Teacher> teacherList = mapper.getTeacher();
//
//        for (Teacher teacher : teacherList) {
//            System.out.println(teacher);
//
//        }


        SqlSession sqlSession = MybaitsUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacherList = mapper.getTeacher2(1);
        //Teacher(id=1, name=秦老师,
        // students=[Student(id=1, name=小明, tid=1), Student(id=2, name=小红, tid=1), Student(id=3, name=小张, tid=1), Student(id=4, name=小李, tid=1), Student(id=5, name=小王, tid=1)])
        System.out.println(teacherList);
        sqlSession.close();



    }


}
