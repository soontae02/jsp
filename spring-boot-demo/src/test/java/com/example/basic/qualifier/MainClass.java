package com.example.basic.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainClass {

	/*
	TODO
	1. IBattery를 구현체 Battery01 클래스를 만듭니다.
	2. MainClass에서 멤버변수 주입 시키고 Test메서드에서 확인하세요.
	*/

//    @Autowired
//    @Qualifier("y")
//    private IBattery battery;

    //생성자 주입
    private IBattery battery;
    @Autowired
    public MainClass(@Qualifier("x") IBattery battery){
        this.battery=battery;
    }

    @Test
    public void test01(){
        System.out.println(battery.getInfo());
    }
}
