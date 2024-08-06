package zyh.service;

import org.springframework.stereotype.Service;

/**
 * @author GG_B
 * @version 1.0
 */
@Service("userDao")
public class UserServiceImpl implements UserService{
    public void findAll() {
        System.out.println("findAll方法实现了");
    }

    public void addUser() {
        int i = 1 / 0;
        System.out.println("addUser方法实现了");
    }

    public void updateUser() {
        System.out.println("updateUser方法实现了");
    }

    public void deleteUser() {
        System.out.println("deleteUser方法实现了");
    }
}
