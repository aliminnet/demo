package com.alimin.net;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AliComponent {

    @PostConstruct
    public String ali() {


        return "component";
    }
}
