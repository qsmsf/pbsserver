package com.easyfly.main.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="myProps") //接收application.yml中的myProps下面的属性
public class MyProps {
    private boolean debugMode;

    public boolean getDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }
}
