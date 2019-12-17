package com.naruto.bean;

public class SpringBeanConstructor {

    private SpringBean springBean;

    public SpringBeanConstructor(SpringBean springBean){
        this.springBean=springBean;
    }

    public String getSpringIocType(){
        return  springBean.getSpringIocType()+" 构造注入(装配)";
    }
}
