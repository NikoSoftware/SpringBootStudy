package com.example.springbootstudy;


import com.example.springbootstudy.redis.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@org.springframework.boot.test.context.SpringBootTest(classes = {SpringbootstudyApplication.class })
public class SpringBootTestDemo {

    @Autowired
    private RedisService redisService;

    @Test
    public void testOne(){
        redisService.set("xiaoming","xiaomi");

       System.out.println( redisService.get("xiaoming"));
    }


}
