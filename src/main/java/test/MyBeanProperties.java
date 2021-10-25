package test;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mybean")
public class MyBeanProperties {

    private String val1;
    private String val2;

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }
}
