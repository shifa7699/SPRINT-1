package com.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lms.entity.MyLibrary;
import com.lms.repository.LibraryRepository;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {
	@Autowired
	LibraryRepository libraryRepository; 

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// CALLING THE PARAMETERIZED CONSTRUCTOR AND USING JPA REPOSITORY METHOD TO SAVE THEM 
		libraryRepository.save(new MyLibrary(98271, "CLEAN CODE", "ROBERT C.MARTIN"));
		libraryRepository.save(new MyLibrary(58760, "CODE COMPLETE", "STEVE McCONNEL"));
		libraryRepository.save(new MyLibrary(20918, "SOFT SKILLS", "JOHN SONMEZ"));
		libraryRepository.save(new MyLibrary(92791, "ATOMIC HABITS", "JAMES CLEAR"));
		libraryRepository.save(new MyLibrary(68209, "BETTER THAN BEFORE", "GRETCHEN RUBIN"));
		libraryRepository.save(new MyLibrary(88171, "MINI HABITS", "STEPHEN GUISE"));
		libraryRepository.save(new MyLibrary(30977, "KARMA", "ACHARYA PRASHANT"));
		libraryRepository.save(new MyLibrary(90019, "NO LIMITS", "MUKESH BANSAL"));
		libraryRepository.save(new MyLibrary(39012, "TRIGGERS AND INSIGHT", "HARISH SAI RAMAN"));
		libraryRepository.save(new MyLibrary(28839, "THE ALCHEMIST", "PAULO COELHO"));
	}
}
