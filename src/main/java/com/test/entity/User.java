package com.test.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by 何冠雄 on 2018/2/12.
 */
public class User {
    private String name;
    private int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private List<Integer> hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Integer> getHobby() {
        return hobby;
    }

    public void setHobby(List<Integer> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobby=" + hobby +
                '}';
    }
}
