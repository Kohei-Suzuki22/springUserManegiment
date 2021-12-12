package com.user.manegiment.basis.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.user.manegiment.basis.form.validation.ValidGroup1;
import com.user.manegiment.basis.form.validation.ValidGroup2;

import lombok.Data;

@Data
public class SignupForm {

	@NotBlank(groups = ValidGroup1.class)
	@Email(groups = ValidGroup2.class)
	private String userId;

	@NotBlank(groups = ValidGroup1.class)
	@Length(min = 4, max = 50, groups = ValidGroup2.class)
	@Pattern(regexp = "^[a-zA-Z0-9]+$", groups = ValidGroup2.class)
	private String password;

	@NotBlank(groups = ValidGroup1.class)
	private String userName;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@NotNull(groups = ValidGroup1.class)
	private Date birthday;

	@Range(min = 0, max = 100, groups=ValidGroup2.class)
	private Integer age;

	@NotNull(groups = ValidGroup1.class)
	private Integer gender;

}
