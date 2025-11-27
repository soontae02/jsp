package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity //JPA가 이 클래스를 entity로 관리함
@Table(name="MEMBER") //테이블명
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Member {

    @Id //pk지정
    private String id;
    @Column(nullable = false, length = 50)
    private String name;
    @CreatedDate //JPA가 인서트시 날짜를 자동 입력 (오디팅 설정 필요)
    @Column(nullable = false)
    private String signDate;

}
