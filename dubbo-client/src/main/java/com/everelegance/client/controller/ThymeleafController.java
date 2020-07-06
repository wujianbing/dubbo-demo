package com.everelegance.client.controller;

import com.everelegance.client.service.ClientService;
import com.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/view")
public class ThymeleafController {

    @Resource
    private ClientService clientService;

    @RequestMapping("/userInfo")
    public String userView(ModelMap map){
        UserVO vo = clientService.getUserInfo();
        map.addAttribute("userInfo",vo);
        return "/index";
    }
}
