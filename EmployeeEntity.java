package com.sultanbahadir.entites;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="EMPLOYEES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	// Sıra No - Employee Serial Number
	@Column(name="SIRANO")
	private String siraNo; // Employee serial number

	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
    @Column(name = "PHONE")
    private String phone;

    @Column(name = "POSITION")
    private String position;
    
    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;
    
    @Column(name = "BIRTH_PLACE")
    private String birthPlace;

    @Column(name = "ADDRESS")
    private String address;
    
    @Column(name = "STATUS")
    private String status; 

    @Column(name = "JOIN_DATE")
    private LocalDate joinDate;

    @Column(name = "EDUCATION_LEVEL")
    private String educationLevel;

    @Column(name = "DATE_CREATED")
    private LocalDate dateCreated;
    
    @Column(name = "SALARY")
    private Double salary;
    
    @Column(name = "ANNUAL_LEAVE")
    private Integer annualLeave;

    @Column(name = "USED_LEAVE")
    private Integer usedLeave; 

    @Column(name = "REMAINING_LEAVE")
    private Integer remainingLeave; 

    @Column(name = "WORK_EXPERIENCE")
    private String workExperience; 
    
    @Column(name = "EMPLOYMENTSTATUS")
    private String employmentStatus; //İZİNLİ ÇALIŞIYOR DURUMU
    
    
}