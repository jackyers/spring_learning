package com.example.day10_filter;

/**
 * @author GG_B
 * @version 1.0
 */
public class User {
    private String name;
    private String sex;
    private String age;

    public User(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
