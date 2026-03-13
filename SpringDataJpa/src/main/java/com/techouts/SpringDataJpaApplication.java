package com.techouts;

import com.techouts.model.Student;
import com.techouts.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
//		Student s1 = context.getBean(Student.class);
//		s1.setName("manoj");
//		s1.setMarks(56);
//		s1.setRollNo(26);
//		Student s2 = context.getBean(Student.class);
//		s2.setName("manoj");
//		s2.setMarks(56);
//		s2.setRollNo(27);
//		Student s3 = context.getBean(Student.class);
//		s3.setName("manoj");
//		s3.setMarks(56);
//		s3.setRollNo(28);
//		Student s4 = context.getBean(Student.class);
//		s4.setName("manoj");
//		s4.setMarks(56);
//		s4.setRollNo(29);
//		Student s5 = context.getBean(Student.class);
//		s5.setName("manoj");
//		s5.setMarks(56);
//		s5.setRollNo(30);
//
//		studentRepo.save(s1);
//		studentRepo.save(s2);
//		studentRepo.save(s3);
//		studentRepo.save(s4);
//		studentRepo.save(s5);

//		Printing All Data
		System.out.println(studentRepo.findAll());

//		Deleting Data
//
	}

}
