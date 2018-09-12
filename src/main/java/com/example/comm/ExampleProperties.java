package com.example.comm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleProperties {
    @Value("${com.example.title}")
    private String title;
    @Value("${com.example.description}")
    private String description;

    //省略getter settet方法

}
