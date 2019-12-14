package com.plugin.sqllog;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zlf
 * @Description
 * @createTime 2019年12月14日 12:09:00
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {

    @Autowired
    TestMapper testMapper;
    @Autowired
    ConfigurableApplicationContext applicationContext;

    @org.junit.Test
    @Bean
    public void test() {
        List<Object> objects = testMapper.selectAll(1L);
        testMapper.updateById("name", -1L);
        testMapper.updateById("name", -1L);
        testMapper.updateById("name", -1L);
        testMapper.updateById("name", -1L);
        testMapper.updateById("name", -1L);
        testMapper.updateById("name", -1L);
        testMapper.updateById("name", -1L);
        System.out.println(objects);
    }
}
