package pers.harry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "pers.harry.mapper")
@SpringBootApplication
public class SbGoods2Application {

    public static void main(String[] args) {
        SpringApplication.run(SbGoods2Application.class, args);
    }

}
