package com.user.manegiment.basis.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {
	
	@NotBlank
	@Email
	private String userId;

	@NotBlank
	@Length(min=4, max=50)
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	private String password;
	
	@NotBlank
	private String userName;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@NotNull
	private Date birthday;

	@Range(min=0, max=100)
	private Integer age;
	
	@NotNull
	private Integer gender;
	
	
	

}
