package test;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyBeanProperties.class)
public class MyConfiguration {

    @Bean
    public MyBean myBean(MyBeanProperties properties){
        MyBean myBean = new MyBean();
        myBean.setVal1(properties.getVal1());
        myBean.setVal2(properties.getVal2());
        return myBean;
    }
}
