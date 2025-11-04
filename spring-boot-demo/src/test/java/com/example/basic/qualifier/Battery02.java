package com.example.basic.qualifier;

import org.springframework.stereotype.Component;

@Component("y")
public class Battery02 implements IBattery {
    @Override
    public String getInfo() {
        return "듀라셀";
    }
}
