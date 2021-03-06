package com.everelegance.client.service;

import com.Service.ProService;
import com.vo.UserVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Reference
    private ProService service;

    public String sayhello(String name) {

        return service.hello(name);

    }

    public UserVO getUserInfo() {

        return service.getUserInfo();

    }
}
