import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import zyh.dao.UserDao;
import zyh.pojo.User;

import java.io.InputStream;
import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */
public class TestMybatis {
    @Test
    public void test() throws Exception{
//        加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
//        创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        创建SqlSessionFactory对象(构建者设计模式，屏蔽了SqlSessionFactory创建的细节)
        SqlSessionFactory sessionFactory = builder.build(in);
//        创建SqlSession对象(工厂模式)，openSession(true)表示将手动提交变为自动提交
        SqlSession sqlSession = sessionFactory.openSession();
//        通过sqlSession生成接口的代理对象(动态代理)
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
//        关闭资源
        sqlSession.close();
        in.close();
    }
}
