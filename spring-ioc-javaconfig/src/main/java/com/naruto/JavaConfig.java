package com.naruto;

import com.naruto.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}
