package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entity.MyLibrary;

public interface LibraryRepository extends JpaRepository<MyLibrary, Integer> {
}