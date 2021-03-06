package com.chow.springcloud.serviceimpl;

import com.chow.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;


@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        boolean send = output.send(MessageBuilder.withPayload(serial).build());
        String result = "*****  serial: " + serial + " ,success:" + send;
        System.out.println(result);
        return result;
    }
}
 
 