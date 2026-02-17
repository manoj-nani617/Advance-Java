package com.techouts.config;


import com.techouts.Alien;
import com.techouts.Computer;
import com.techouts.Desktop;
import com.techouts.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.convert.Property;

@Configuration
@ComponentScan("com.techouts")
public class AppConfig {

//    @Bean(name = "desktop")
//    @Scope(value = "prototype")
//    @Qualifier("desktop")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean(name = "alien")
//    @Scope(value = "singleton")
//    public Alien alien(@Qualifier("desktop")@Autowired Computer com) {
//        Alien a = new Alien();
//        a.setAge(22);
//        a.setSalary(5000);
//        a.setCom(com);
//        return a;
//
//    }
//    @Bean(name = "laptop")
//    @Scope(value = "singleton")
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
