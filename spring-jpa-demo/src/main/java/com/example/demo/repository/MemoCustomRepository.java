package com.example.demo.repository;

import com.example.demo.entity.Memo;

import java.util.List;

public interface MemoCustomRepository {

    //구현체가 가져야 할 추상메서드 선언
    int updateTest(String writer, String text);

    //JPQL조인
    List<Memo> mtoJoin1();

}
