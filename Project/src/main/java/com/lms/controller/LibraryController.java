package com.lms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.dto.LibraryValidation;
import com.lms.entity.MyLibrary;
import com.lms.service.MyServices;

@RestController
public class LibraryController { // THIS CLASS IS USED TO CREATE REST API

	@Autowired
	private MyServices myservices; //

	// MAPPING USED HERE TO FETCH ALL THE BOOKS FROM THE LIBRARY
	@GetMapping("/LibrarybooksAvailable")
	public List<MyLibrary> getAllBooks() {
		return myservices.getAllBooks();
	}

	// MAPPING USED HERE TO FETCH BOOKS THROUGH AUTHOR'S NAME
	@GetMapping("/LibrarybooksAvailable/{id}")
	public MyLibrary getBookById(@PathVariable int id) {
		return myservices.findById(id);
	}

	// MAPPING USED TO ADD A NEW BOOK INTO THE LIBRARY
	@PostMapping("/LibrarybooksAvailable")
	public ResponseEntity<MyLibrary> saveEmployee(@RequestBody @Valid LibraryValidation libraryValidation, MyLibrary mylib) {
		return new ResponseEntity<>(myservices.createLibrary(libraryValidation, mylib), HttpStatus.CREATED);
	}

	// MAPPING USED TO UPDATE AN EXISTING BOOK PRESENT IN THE LIBRARY
	@PutMapping("/LibrarybooksAvailable/{id}")
	public MyLibrary updateABook(@RequestBody MyLibrary mylib, @PathVariable int id) {
		return myservices.updateABook(mylib, id);
	}

	// MAPPING USED TO DELETE A EXISTING BOOK FROM THE LIBRARY THROUGH BOOKID
	@DeleteMapping("/LibrarybooksAvailable/{id}")
	public String deleteABook(int id) {
		myservices.deleteABook(id);
		return "Book id " + id + " has been deleted!!!";
	}
}
