package com.alibaba.dubbo.demo.provider.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderOne {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider-one.xml"});

        context.start();
        System.in.read();
    }
}
