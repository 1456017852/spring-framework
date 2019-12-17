package com.naruto.bean;

import org.springframework.stereotype.Component;

@Component//spring bean
public class SpringBean {

    public String getSpringIocType(){
        return "spring ioc annotation";
    }

}
