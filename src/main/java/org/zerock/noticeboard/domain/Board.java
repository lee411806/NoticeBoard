package org.zerock.noticeboard.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter //빌더 패턴 자동으로 생성
@Builder //빌더 패턴 자동으로 생성
@AllArgsConstructor //모든 필드를 포함하는 생성자를 자동으로 생성
@NoArgsConstructor // 기본 생성자 자동으로 생성
@ToString // 어노테이션은 객체의 문자열 표현을 자동으로 생성
public class Board extends BaseEntity{
    @Id

    //기본키 자동으로 생성
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    //DB에 열 매핑
    @Column(length = 500, nullable = false) //컬럼의 길이와 null허용여부
    private String title;

    @Column(length = 2000, nullable = false)
    private String content;

    @Column(length = 50, nullable = false)
    private String writer;

    public void change(String title, String content){
        this.title = title;
        this.content = content;
    }


}