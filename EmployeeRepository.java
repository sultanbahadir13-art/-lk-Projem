package com.sultanbahadir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sultanbahadir.dto.EmployeeDTO;
import com.sultanbahadir.entites.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	List<EmployeeEntity> findByStatus(String status);
	@Query("SELECT e FROM EmployeeEntity e " +
		       "WHERE e.firstName LIKE %:keyword% " +
		       "OR e.lastName LIKE %:keyword% " +
		       "OR e.position LIKE %:keyword% " +
		       "OR e.status LIKE %:keyword% " +
		       "OR e.phone LIKE %:keyword% " +
		       "OR e.email LIKE %:keyword%")
		List<EmployeeEntity> searchEmployees(@Param("keyword") String keyword);
}