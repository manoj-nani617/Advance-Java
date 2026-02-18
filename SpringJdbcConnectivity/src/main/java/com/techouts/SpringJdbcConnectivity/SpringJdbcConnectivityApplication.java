package com.techouts.SpringJdbcConnectivity;

import com.techouts.SpringJdbcConnectivity.modal.Student;
import com.techouts.SpringJdbcConnectivity.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcConnectivityApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcConnectivityApplication.class, args);
		Student s = context.getBean("student", Student.class);
		s.setMarks(90);
		s.setName("manoj");
		s.setRollNo(26);
		System.out.println(s);
		StudentService service = context.getBean("studentService",StudentService.class);
		service.addStudent(s);
		List<Student> list = service.getStudents();
		System.out.println(list);

	}

}
