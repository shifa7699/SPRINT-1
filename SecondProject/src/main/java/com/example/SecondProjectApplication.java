package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
public class SecondProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecondProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee e1 =Employee.builder().empname("Shifa").address("Kolkata").mobno(765198736).build();
//		Employee e2 =Employee.builder().empname("Nisha").address("Delhi").mobno(765827277).build();
//		Employee e3 =Employee.builder().empname("Shruti").address("Mumbai").mobno(999851987).build();
//		Employee e4 =Employee.builder().empname("Elina").address("Orissa").mobno(765777102).build();
//		Employee e5 =Employee.builder().empname("Suchitra").address("Chennai").mobno(765651198).build();
//		
//		employeeRepository.save(e1);
//		employeeRepository.save(e2);
//		employeeRepository.save(e3);
//		employeeRepository.save(e4);
//		employeeRepository.save(e5);
//		
//		System.out.println("----------------All are Saved---------------");

		employeeRepository.save(new Employee("sifa", "wb", 12345L));
		employeeRepository.save(new Employee("amitava", "chennai", 22345L));
		employeeRepository.save(new Employee("Anju", "delhi", 12395L));
		System.out.println("----------------All are Saved---------------");

	}
}
