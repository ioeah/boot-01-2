package com.example.boot.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/5/10 16:58
 */
@Component
@ConfigurationProperties(prefix = "user")
public class User {

    private String stdId;
    private String userName;
    private String[] hobby;

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "stdId='" + stdId + '\'' +
                ", userName='" + userName + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
