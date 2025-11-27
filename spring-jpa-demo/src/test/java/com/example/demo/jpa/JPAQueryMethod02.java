package com.example.demo.jpa;

import com.example.demo.entity.Memo;
import com.example.demo.repository.MemoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.TestPropertySource;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class JPAQueryMethod02 {

    @Autowired
    MemoRepository memoRepository;

//    @Test
//    public void testCode01(){
//        //List<Memo> list = memoRepository.findByIdBetween(10L, 20L);
//        //List<Memo> list = memoRepository.findByTextLike("%1%");
//        //List<Memo> list = memoRepository.findByTextLikeOrderByIdDesc("%1%");
//        //List<Memo> list = memoRepository.findByWriterIn(Arrays.asList("admin10", "admin20", "admin30"));
//
//        Pageable pageable = PageRequest.of(0, 10);
//        Page<Memo> list = memoRepository.findByTextLikeOrWriterLike("%1%", "%2%", pageable);
//
//        System.out.println( list.getContent().toString() );
//
//    }

    //JPQL
//    @Test
//    public void testCode02() {
//        //List<Memo> list = memoRepository.getListDesc();
//        //List<Memo> list = memoRepository.getListLike("10");
//        List<Object[]> list = memoRepository.getListAsc();
//
//        System.out.println(list);
//    }

//    @Test
//    public void testCode03() {
//        Memo memo = Memo.builder().id(5L).text("업데이트").writer("업데이트").build();
//        int result = memoRepository.updateMemo(memo);
//        System.out.println("업데이트 성공여부: " + result);
//    }

//    @Test
//    public void testCode04() {
//        Pageable pageable = PageRequest.of(0, 10);
//        Page<Memo> page = memoRepository.getListJpa(5L, pageable);
//
//        System.out.println(page.getContent().toString());
//
//    }

    @Test
    public void testCode5() {
        List<Memo> list = memoRepository.getNativeQuery(5L);
        System.out.println(list.toString());
    }

}
