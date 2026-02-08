package cn.wenzhuo4657.dailyWeb.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonClientConfig {

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        String host1 = System.getenv("HOST1");
        config.useSingleServer()
                .setAddress("redis://"+host1+":6379")
                .setDatabase(0);

        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        // 禁用多态类型处理，避免需要@class字段
        mapper.disable(com.fasterxml.jackson.databind.MapperFeature.USE_ANNOTATIONS);
        mapper.disable(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        JsonJacksonCodec codec = new JsonJacksonCodec(mapper);
        config.setCodec(codec);

        return Redisson.create(config);
    }
}
