package com.everelegance.client.controller;

import com.everelegance.client.service.ClientService;
import com.vo.UserVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class IndexController {

    @Resource
    private ClientService clientService;

    @RequestMapping("/{name}")
    public String sayHello(@PathVariable("name") String name) {

        return clientService.sayhello(name);
    }

    @RequestMapping("/userInfo")
    public UserVO getUserInfo(){
        return clientService.getUserInfo();
    }

}
