package com.naruto.bean;

public class SpringBeanAttribute {

    private SpringBean springBean;

    public SpringBean getSpringBean() {
        return springBean;
    }

    public void setSpringBean(SpringBean springBean) {
        this.springBean = springBean;
    }

    public String getSpringIocType(){
        return  springBean.getSpringIocType()+" 属性注入(装配)";
    }
}
