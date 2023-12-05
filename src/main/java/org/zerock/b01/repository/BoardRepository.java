package org.zerock.b01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.b01.domain.Board;
import org.zerock.b01.repository.search.BoardSearch;


//spring Data JPA를 이용할 때는 JpaRepository인터페이스를 이용해서 인터페이스를 선언만으로
// 데이터 베이스 관련 작업(Crud와 페이징)을 어느 정도 처리할 수 있다.
//(마치 MyBatis를 이용할 때 매퍼 인터페이스만을 선언하는 것과 유사)
public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {


}
