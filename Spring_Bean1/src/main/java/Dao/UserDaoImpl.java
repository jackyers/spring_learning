package Dao;

/**
 * @author GG_B
 * @version 1.0
 */
public class UserDaoImpl implements UserDao{
    public UserDaoImpl() {
        System.out.println("UserDaoImpl的构造函数执行");
    }

    public void addUserDao() {
        System.out.println("成功新增User");
    }
    public void init(){
        System.out.println("UserDao初始化");
    }
    public void destroy(){
        System.out.println("UserDao销毁");
    }
}
