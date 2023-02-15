package com.lms.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Data

public class LibraryValidation { // THIS CLASS USED TO GIVE VALIDATION
	@NotBlank(message = "Invalid book name")
	@Size (min = 5, max = 40, message = "Invalid Size")
	private String bname;
	@NotBlank (message = "Invalid author name")
	@Size(min = 5, max = 20, message = "Invalid Size")
	private String aname;

}
