package com.xrca.dubbo.provider.service.impl;

import com.xrca.dubbo.service.GreetingService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author xrca
 * @description 服务实现
 * @date 2020-12-24 11:07
 **/
@DubboService(version = "1.0")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi(String name) {
        return "hi " + name + " !";
    }

    @Override
    public String goodbye(String name) {
        return "goodbye " + name + " !";
    }
}
