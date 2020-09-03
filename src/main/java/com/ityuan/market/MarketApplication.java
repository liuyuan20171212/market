package com.ityuan.market;

import com.ityuan.market.utils.SpringContextUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("com.ityuan.market.dao.mapper")
@SpringBootApplication
public class MarketApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MarketApplication.class, args);
        SpringContextUtil.setApplicationContext(context);
    }

}
