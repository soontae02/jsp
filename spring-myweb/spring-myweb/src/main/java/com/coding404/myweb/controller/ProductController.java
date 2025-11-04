package com.coding404.myweb.controller;

import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private ProductService productService;

    //목록화면
    @GetMapping("/productList")
    public String productList() {
        return "product/productList";
    }
    //등록화면
    @GetMapping("/productReg")
    public String productReg() {
        return "product/productReg";
    }
    //상세화면
    @GetMapping("/productDetail")
    public String productDetail() {
        return "product/productDetail";
    }
    //상품등록
    @PostMapping("/prodRegist")
    public String prodRegist(ProductVO productVO) {

        productService.prodRegist(productVO);

        return "redirect:/product/productList";
    }



}
