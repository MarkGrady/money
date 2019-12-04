package com.qf.money.config;

import com.qf.money.utils.RedisUtilsSerializable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {
    //    自动加载application.properties中关于Redis的配置参数并初始化JedisConnectionFactory对象
    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        return new JedisConnectionFactory();
    }
    @Bean
    public RedisTemplate redisTemplate(@Qualifier("jedisConnectionFactory") JedisConnectionFactory jedisConnectionFactory){
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//       设置redisTemplate对象配置参数
        redisTemplate.setConnectionFactory(jedisConnectionFactory);
//        设置redisTemplate对象key值得序列化转换器
        redisTemplate.setKeySerializer(new RedisUtilsSerializable());
//        设置redisTemplate对象value值得序列化转换器
        redisTemplate.setValueSerializer(new RedisUtilsSerializable());
        return redisTemplate;
    }

}