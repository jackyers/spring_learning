package zyh.dao;

import zyh.pojo.User;

import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */
public interface UserDao {
    List<User> findAll();
}
