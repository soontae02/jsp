package com.coding404.myweb.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoOrderVO {
    private int oId;
    private int mId; //FK
    private String productName;

    //N:1 - 1관계의 멤버를 추가
    //private String name;
    private DemoMemberVO MemberVO;
}
