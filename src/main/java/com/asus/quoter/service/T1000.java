package com.asus.quoter.service;

import com.asus.quoter.api.service.Quoter;

public class T1000 extends TerminatorQuoter implements Quoter {

    @Override
    public void sayQuote() {
        System.out.println("I'm liquid!");
    }
}
