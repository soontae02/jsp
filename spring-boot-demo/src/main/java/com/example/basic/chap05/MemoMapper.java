package com.example.basic.chap05;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {
    List<MemoVO> list();
    void memoRegist(MemoVO memoVO);
    void memoDelete(MemoVO memoVO);
}
