package com.example.basic.chap03;

import java.time.LocalDateTime;

public class SimpleVO {

    private String name;
    private int age;
    private LocalDateTime regdate;

    public SimpleVO() {}
    public SimpleVO(int age, String name, LocalDateTime regdate) {
        this.age = age;
        this.name = name;
        this.regdate = regdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }
}
