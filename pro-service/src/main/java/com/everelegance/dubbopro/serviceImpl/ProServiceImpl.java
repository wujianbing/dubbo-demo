package com.everelegance.dubbopro.serviceImpl;

import com.Service.ProService;
import com.everelegance.dubbopro.domain.User;
import com.vo.UserVO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

@Service(interfaceName = "proServiceImpl")
public class ProServiceImpl implements ProService {
    User user = new User();

    {
        user.setName("张三");
        user.setAge(23);
        user.setSex("男");
        user.setIdCard("33232532211");
        user.setPhone("13615223232");
    }

    @Override
    public String hello(String name) {
        return "hello," + name + ",welcome";
    }

    @Override
    public UserVO getUserInfo() {
        UserVO vo = new UserVO();
        BeanUtils.copyProperties(user, vo);
        return vo;
    }
}
