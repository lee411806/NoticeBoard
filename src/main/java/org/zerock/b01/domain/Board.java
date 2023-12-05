package org.zerock.b01.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BaseEntity{
    @Id  // 엔터티의 기본 키를 지정합니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Identity(정체성, 마리아DB(마이sql) - auto_increment ,데이터베이스에 위임한다.
    private Long bno;

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
