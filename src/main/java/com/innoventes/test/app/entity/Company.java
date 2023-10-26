package com.innoventes.test.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.*;

import com.innoventes.test.app.ValidAnnotation.EvenPositiveOrZero;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "company")
@Entity
public class Company extends BaseEntity {

	@Id
	@SequenceGenerator(sequenceName = "company_seq", allocationSize = 1, name = "company_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
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
//@EvenPositiveOrZero(message = "provide only even positive or zero number ")
	@Column(name = "strength")
	private Integer strength;
	
	@Column(name = "website_url")
	private String webSiteURL;


	@Pattern(regexp = "^[a-zA-Z]{2}\\d{2}[eEnN]?$",message = "Invalid company code format")
	@Column(name="company_code",unique = true)
	private String companyCode;
}
