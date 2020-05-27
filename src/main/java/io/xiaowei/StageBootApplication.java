package io.xiaowei;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @ClassName StageBootApplication
 * @Description 入口
 * @Author xiaowei
 * @Date 2020/5/26 11:08 下午
 * @Version 1.0
 **/
@Slf4j
@EnableJpaAuditing
@SpringBootApplication
public class StageBootApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(StageBootApplication.class, args);
            log.info("Start Success");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            log.error("Start Fail");
        }
    }
}
