package com.lms.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lms.dto.LibraryValidation;
import com.lms.entity.MyLibrary;

@Component
public interface MyServices {

	// SERVICES THAT ARE AVAILABLE

	MyLibrary createLibrary(LibraryValidation libraryValidation, MyLibrary mylib); // METHOD TO SAVE CHANGES
			
	List<MyLibrary> getAllBooks(); // METHOD TO FETCH ALL THE BOOKS AVAILABLE

	MyLibrary findById(int id); // METHOD TO FETCH A BOOK THROGH BOOK ID

	MyLibrary updateABook(MyLibrary mylib, int id); // METHOD TO UPDATE A BOOK DETAILS

	String deleteABook(int id); // METHOD TO DELETE A BOOK THROUGH IT'S ID
}
