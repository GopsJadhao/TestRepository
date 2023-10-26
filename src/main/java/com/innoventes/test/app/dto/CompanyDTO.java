package com.innoventes.test.app.dto;

import com.innoventes.test.app.ValidAnnotation.EvenPositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;

	@NotBlank(message = "it can not  be empty ")
	@Size(min = 5,message = "at least 5 char long ")
	@Column(name = "company_name")

	private String companyName;
	@NotBlank(message = "it can not be empty")
	@Email(message = "Invalid email format")
	@Column(name = "email")
	private String email;

	@PositiveOrZero(message = "it should be positive or zero")
	@EvenPositiveOrZero(message = "provide only even positive or zero number ")
	@Column(name = "strength")
	private Integer strength;

	@Column(name = "website_url")
	private String webSiteURL;

	@Pattern(regexp = "^[a-zA-Z]{2}\\d{2}[eEnN]?$",message = "Invalid company code format")
	@Column(name="company_code",unique = true)
	private String companyCode;

}
