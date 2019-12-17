package com.naruto;

import com.naruto.bean.SpringBean;
import com.naruto.bean.SpringBeanAttribute;
import com.naruto.bean.SpringBeanConstructor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocXmlTest {

    @Test
    public void test_ClassPathXmlApplication(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SpringBean springBean =(SpringBean) applicationContext.getBean("springBean");
        System.out.println(springBean.getSpringIocType());
    }

    @Test
    public void test_ClassPathXmlApplication_constructor(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SpringBeanConstructor springBeanConstructor =(SpringBeanConstructor) applicationContext.getBean("springBeanConstructor");
        System.out.println(springBeanConstructor.getSpringIocType());
    }

    @Test
    public void test_ClassPathXmlApplication_attribute(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SpringBeanAttribute springBeanAttribute =(SpringBeanAttribute) applicationContext.getBean("springBeanAttribute");
        System.out.println(springBeanAttribute.getSpringIocType());
    }



}
