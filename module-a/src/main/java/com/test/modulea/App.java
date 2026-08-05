package com.test.modulea;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "Module A - Hello World!";
        if (StringUtils.isNotEmpty(message)) {
            System.out.println(message);
        }
    }
}
