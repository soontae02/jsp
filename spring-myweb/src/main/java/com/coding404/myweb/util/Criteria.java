package com.coding404.myweb.util;

import lombok.Data;

@Data //getter, setter, toString
public class Criteria {

    private int page; //현재 페이지번호
    private int amount; //데이터 개수

    //기본생성자
    private Criteria() {
        this(1, 10);
    }
    //페이지번호와 데이터개수를 전달받는 생성자
    private Criteria(int page, int amount) {
        this.page = page;
        this.amount = amount;
    }

    //limit의 함수의 offset값 계산하는 getter
    public int pageStart() {
        return (page - 1) * amount;
    }

}
