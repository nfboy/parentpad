package com.alibaba.dubbo.demo.provider.one;

import com.alibaba.dubbo.demo.DemoService;

public class DemoServiceOneImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
