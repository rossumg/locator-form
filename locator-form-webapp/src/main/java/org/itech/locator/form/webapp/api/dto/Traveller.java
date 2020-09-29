package org.itech.locator.form.webapp.api.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Traveller {

	public enum Sex {
		MALE, FEMALE, OTHER, UNKNOWN
	}
	@NotBlank
	@Size(max = 50)
    private String lastName;
	@NotBlank
	@Size(max = 50)
    private String firstName;
	@Size(max = 3)
    private String middleInitial;
	@Size(max = 15)
    private String seatNumber;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	@NotNull
	private Sex sex;
	@NotBlank
	@Size(max = 50)
    private String nationality;
	@Size(max = 50)
    private String passportNumber;
}
