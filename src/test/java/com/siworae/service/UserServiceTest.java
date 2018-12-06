package com.siworae.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @program: spring
 * @ClassName: UserServiceTest
 * @Date: 2018/12/6 15:22
 * @Author: Administrator$
 */
public class UserServiceTest {

    @Test
    public void test1() {
        /**
         * 加载spring配置文件
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //取出Bean容器中的实例
        UserService userService = (UserService) context.getBean("userService");

        //调用bean方法
        userService.test();
    }
}