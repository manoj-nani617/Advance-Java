package com.techouts;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Cpu {
    public Cpu() {
        System.out.println("Cpu Object is created");
    }

    public void method()
    {
        System.out.println("Running cpu");
    }
}
