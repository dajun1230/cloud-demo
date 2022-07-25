package com.ycj.user;

import com.ycj.user.mapper.UserMapper;
import com.ycj.user.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads(){
    }

    @Test
    void testMapper() {
        User user = userMapper.queryById(1L);
        System.out.println(user);
    }
}
