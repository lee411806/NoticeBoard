package org.zerock.noticeboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NoticeBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoticeBoardApplication.class, args);
    }

}
