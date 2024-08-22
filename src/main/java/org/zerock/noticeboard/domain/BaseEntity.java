package org.zerock.noticeboard.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

//baseentity는 테이블에 매핑되지는 않지만 하위 엔티티들은 매핑될떄 baseentity 필드들을 포함해서 매핑된다
// 상속받는 엔티티들이 공통적으로 사용할 수 있는 필드를 정의
@MappedSuperclass
//엔티티가 데이터 베이스에 추가되거나 변경될 때 자동으로 시간 값을 지정할 수 있다.
// EntityListeners 이벤트 감지,AuditingEntityListener 특정 필드가 언제 생성되었는지 자동으로 정보저장이 가능 -> CreatedDate,LastModifiedDate 사용가능
@EntityListeners(value = { AuditingEntityListener.class })
@Getter
abstract class BaseEntity {

    @CreatedDate
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name ="moddate" )
    private LocalDateTime modDate;

}