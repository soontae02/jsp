package com.example.basic.qualifier;

import org.springframework.stereotype.Component;

@Component("x") //이 빈의 이름을 명시
public class Battery01 implements IBattery {

    @Override
    public String getInfo() {
        return "에너자이저";
    }

}
