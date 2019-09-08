package com.asus.quoter.service;

import com.asus.quoter.api.annotation.DeprecatedClass;
import com.asus.quoter.api.annotation.InjectRandomInt;
import com.asus.quoter.api.annotation.PostProxyConstruct;
import com.asus.quoter.api.annotation.Profiling;
import com.asus.quoter.api.service.Quoter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profiling
//@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @Value("Where is John Connor?")
    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase 1 - java constructor is running. Field repeat = " + repeat);
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase 2 - @PostConstruct annotation init method. Field repeat = " + repeat);
    }


    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxyConstruct
    public void sayQuote() {
        System.out.println("Phase 3 - @PostProxyConstruct annotation running");
        for (int i = 0; i<repeat; i++){
            System.out.println("Message: " + message);
        }
    }

}
