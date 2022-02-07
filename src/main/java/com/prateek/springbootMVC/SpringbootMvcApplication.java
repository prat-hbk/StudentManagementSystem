package com.prateek.springbootMVC;

import com.prateek.springbootMVC.model.Student;
import com.prateek.springbootMVC.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Prateek", "Sharma", "sprateek63@xyz.com");
		studentRepository.save(student1);

		Student student2 = new Student("Vibhor", "Sharma", "vibhor711@abc.com");
		studentRepository.save(student2);

		Student student3 = new Student("John", "Cena", "ucan'tseeme@wwe.com");
		studentRepository.save(student3);*/
	}


}
