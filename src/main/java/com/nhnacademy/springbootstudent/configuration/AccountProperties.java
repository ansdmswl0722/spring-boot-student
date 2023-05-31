package com.nhnacademy.springbootstudent.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;

@ConfigurationProperties(prefix = "com.nhn.account.system")
@Getter
@Setter
public class AccountProperties {
    private String version;

    @Override
    public String toString() {
        return "{" +
                "version='" + version + '\'' +
                '}';
    }
}
