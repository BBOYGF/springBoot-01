package com.learn.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix ="user")
public class User {
    private String lastname;
    private int age;

    public String getLastnameame() {
        return lastname;
    }

    public void setLastname(String name) {
        this.lastname = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
