package com.qf.money.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    //    创建topic类型的queue
    @Bean("queueMsg")
    public Queue queueMsg(){
        return new Queue("topic.msg");
    }
    @Bean("queueMsgs")
    public Queue queueMsgs(){
        return new Queue("topic.msgs");
    }

    //    创建一个topicExchange对象
    @Bean("topicExchange")
    public TopicExchange topicExchange(){
        return new TopicExchange("topic.exchange");
    }

    //    创建绑定对象 将队列msg与交换机绑定
    @Bean
    public Binding bindExchange(@Qualifier("queueMsg") Queue queue
            , @Qualifier("topicExchange") TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("topic.msg");
    }
    //    创建绑定对象 将队列msgs与交换机绑定
    @Bean
    public Binding bindExchange2(@Qualifier("queueMsgs") Queue queue2
            ,@Qualifier("topicExchange") TopicExchange exchange){
        return BindingBuilder.bind(queue2).to(exchange).with("topic.msgs");
    }
}
