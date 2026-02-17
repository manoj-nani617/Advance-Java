package com.techouts;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    private Cpu cpu;

//    public Laptop() {
//        System.out.println("Laptop Object is created");
//    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public void compile() {
        System.out.println("Executing in Laptop");
    }
    public void laptopMethod() {
//        cpu.method();
        System.out.println("Executing the statements");
    }
}
