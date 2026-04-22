package com.sultanbahadir.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO {
	
	private Long id;
	private String siraNo; 
	private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String position;
    private LocalDate dateOfBirth;
    private String birthPlace;
    private String address;
    private String status; 
    private LocalDate joinDate;
    private String educationLevel;
    private LocalDate dateCreated;
    private Double salary;
    private Integer annualLeave;
    private Integer usedLeave; 
    private Integer remainingLeave; 
    private String workExperience; 
    private String employmentStatus; 

}
	
	
