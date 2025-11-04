package com.coding404.myweb.test;

import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.product.ProductMapper;
import com.coding404.myweb.product.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test01 {

    @Autowired
    ProductMapper productMapper;

    @Test
    public void test01(){

        new ProductVO();
        //빌더패턴
        ProductVO vo = ProductVO.builder()
                .prodPrice(1000)
                .prodEnddate("2020-12-20")
                .prodWriter("테스트")
                .prodName("상품명")
                .build();
    }

//    //테스트 코드 insert
//    @Test
//    public void test02(){
//
//        for(int i = 1; i <= 100; i++) {
//            ProductVO vo = ProductVO.builder()
//                    .prodName("user" + i)
//                    .prodWriter("becy96")
//                    .prodEnddate("2020-12-20")
//                    .prodPrice(1000 * i)
//                    .prodCount(1000 * i)
//                    .prodDiscount(i)
//                    .prodComment("test" + i)
//                    .prodContent("test" + i)
//                    .build();
//
//            productMapper.prodRegist(vo);
//
//        }
//
//    }

}
