package com.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Entity
@Table(name = "Library") //TABLE NAMED 'LIBRARY' WILL BE CREATED IN DATABASE

public class MyLibrary { //CLASS WHERE ALL THE INFORMATION OF LIBRARY IS PRESENT
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookid", length = 7)
	private Integer id;
	@Column(name = "bookname", length = 20)
	private String bname;
	@Column(name = "author", length = 20)
	private String aname;
// PARAMETERIZED CONSTRUCTOR CREATED FOR BOOK ID, BOOK NAME AND AUTHOR NAME
	public MyLibrary(int id, String bname, String aname) {
	
		this.id = id;
		this.bname = bname;
		this.aname = aname;
	}
// PARAMETERIZED CONSTRUCTOR CREATED FOR BOOK NAME AND AUTHOR NAME
	public MyLibrary(String bname, String aname) {
		
		this.bname = bname;
		this.aname = aname;
	}
// NO-ARGS CONSRUCTOR CREATED
	public MyLibrary() {

	}
// GETTER SETTER METHODS FOR ALL THE VARIABLES
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
}
