package com.telsuko.GitTestingProjectIntellij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GitTestingProjectIntellijApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(GitTestingProjectIntellijApplication.class, args);
		Student student =context.getBean(Student.class);
		String result = student.greet();


	}

}
