package com.techouts.SpringBootDemo;

import com.techouts.SpringBootDemo.repo.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
//		LaptopService service = context.getBean(LaptopService.class);
//		service.laptopService();
		LaptopRepository repository = context.getBean("repo", LaptopRepository.class);
		repository.repo();
	}

}
