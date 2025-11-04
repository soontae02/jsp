package com.coding404.myweb.util;

import lombok.Data;

@Data //getter, setter, toString
public class Criteria {

    private int page; //현재 페이지번호
    private int amount; //데이터 개수

    //검색에 사용할 키워드 추가
    private String searchName;
    private String searchContent;
    private String searchPrice;
    private String startDate;
    private String endDate;
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
    public int getPageStart() {
        return (page - 1) * amount;
    }

}
