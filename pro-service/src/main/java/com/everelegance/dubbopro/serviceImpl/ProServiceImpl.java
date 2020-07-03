package com.everelegance.dubbopro.serviceImpl;

import com.Service.ProService;
import org.apache.dubbo.config.annotation.Service;

@Service(interfaceName = "proServiceImpl")
public class ProServiceImpl implements ProService {

    @Override
    public String hello(String name) {
        return "hello,"+name+",welcome";
    }
}
