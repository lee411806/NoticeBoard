package org.zerock.noticeboard;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

// springboot에 커넥션 풀 정보입력하면 실행할때 자동적으로 Datasource가 빈으로 만들어져서 객체생성
//이걸 테스트
@SpringBootTest
@Log4j2
public class DataSourceTests {

    @Autowired
    private DataSource dataSource;

    //@Test: 이 메소드는 JUnit 테스트 메소드
    @Test
    public void testConnection() throws SQLException {

        //@Cleanup: 이 어노테이션은 Lombok에서 제공하는 것으로, 테스트가 끝난 후 자원을 자동으로 해제
        @Cleanup
        Connection con = dataSource.getConnection();

        log.info(con);


        //Assertions.assertNotNull(con);: 이 줄은 Connection 객체가 null이 아닌지를 확인하여, 연결이 성공적으로 이루어졌는지 확인
        Assertions.assertNotNull(con);
    }
}