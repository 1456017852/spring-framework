package com.naruto;

import com.naruto.bean.SpringBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//在测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes = SpringConfig.class)//@ContextConfiguration会告诉它需要在SpringConfig中加载配置
public class SpringIocAnnotationTest {

    @Autowired//装配
    private SpringBean springBean;

    @Test
    public void test_SpringJUnit4ClassRunner(){
        System.out.println(springBean.getSpringIocType());
    }

    @Test
    public void test_AnnotationConfigurationApplicationContext(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        SpringBean springBean = (SpringBean)applicationContext.getBean("springBean");
        System.out.println(springBean.getSpringIocType());
    }

}
