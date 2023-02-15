package com.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dto.LibraryValidation;
import com.lms.entity.MyLibrary;
import com.lms.repository.LibraryRepository;
import com.lms.service.MyServices;

@Service
public class ServiceImpl implements MyServices {
	@Autowired
	LibraryRepository libraryRepository; 
// IMPLEMENTED METHODS OF MYSERVICES CLASS
	@Override
	public MyLibrary createLibrary(LibraryValidation libraryValidation, MyLibrary mylib) {
		System.out.println(mylib.getBname()+""+mylib.getAname());
		return libraryRepository.save(mylib);	
	}

	@Override
	public List<MyLibrary> getAllBooks() {
		return libraryRepository.findAll();
	}

	@Override
	public MyLibrary findById(int id) {
		return libraryRepository.findById(id).get();
	}

	@Override
	public MyLibrary updateABook(MyLibrary mylib, int id) {
		MyLibrary mylib1 = libraryRepository.findById(id).get();
		mylib1.setBname(mylib1.getBname());
		mylib1.setAname(mylib1.getAname());
		return libraryRepository.save(mylib1);
	}

	@Override
	public String deleteABook(int id) {
		libraryRepository.deleteById(id);
		return "Book Deleted with the id " + id;
	}
}
