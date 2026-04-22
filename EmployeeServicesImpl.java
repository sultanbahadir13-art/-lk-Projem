package com.sultanbahadir.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.jdbc.BatchedTooManyRowsAffectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sultanbahadir.dto.EmployeeDTO;
import com.sultanbahadir.entites.EmployeeEntity;
import com.sultanbahadir.repository.EmployeeRepository;
import com.sultanbahadir.shared.IEmployeeServices;

@Service
public class EmployeeServicesImpl implements IEmployeeServices {

	@Autowired
	EmployeeRepository repo;

	@Override
	public EmployeeDTO saveOrupdate(EmployeeDTO employeeDTO) {

		EmployeeEntity entity;
	
		if (employeeDTO.getId() != null) {
			entity = repo.findById(employeeDTO.getId()).orElse(new EmployeeEntity());
		} else {
			entity = new EmployeeEntity();
		}
			entity.setEmail(employeeDTO.getEmail());
			entity.setFirstName(employeeDTO.getFirstName());
			entity.setLastName(employeeDTO.getLastName());
			entity.setAddress(employeeDTO.getAddress());
			entity.setBirthPlace(employeeDTO.getBirthPlace());
			entity.setDateOfBirth(employeeDTO.getDateOfBirth());
			entity.setEducationLevel(employeeDTO.getEducationLevel());
			entity.setJoinDate(employeeDTO.getJoinDate());
			entity.setPhone(employeeDTO.getPhone());
			entity.setStatus(employeeDTO.getStatus());
			entity.setAnnualLeave(employeeDTO.getAnnualLeave());
			entity.setDateCreated(employeeDTO.getDateCreated());
			entity.setEmploymentStatus(employeeDTO.getEmploymentStatus());
			entity.setPosition(employeeDTO.getPosition());
			entity.setRemainingLeave(employeeDTO.getRemainingLeave());
			entity.setSalary(employeeDTO.getSalary());
			entity.setSiraNo(employeeDTO.getSiraNo());
			entity.setUsedLeave(employeeDTO.getUsedLeave());
			entity.setWorkExperience(employeeDTO.getWorkExperience());
			EmployeeEntity employeeEntity = repo.save(entity);

		
		return convertEntityToDTO(entity);
	}
	private EmployeeDTO convertEntityToDTO(EmployeeEntity employeeEntity) {
		EmployeeDTO dto = new EmployeeDTO();

		dto.setEmail(employeeEntity.getEmail());
		dto.setFirstName(employeeEntity.getFirstName());
		dto.setLastName(employeeEntity.getLastName());
		dto.setAddress(employeeEntity.getAddress());
		dto.setBirthPlace(employeeEntity.getBirthPlace());
		dto.setDateOfBirth(employeeEntity.getDateOfBirth());
		dto.setEducationLevel(employeeEntity.getEducationLevel());
		dto.setJoinDate(employeeEntity.getJoinDate());
		dto.setPhone(employeeEntity.getPhone());
		dto.setStatus(employeeEntity.getStatus());
		dto.setAnnualLeave(employeeEntity.getAnnualLeave());
		dto.setDateCreated(employeeEntity.getDateCreated());
		dto.setEmploymentStatus(employeeEntity.getEmploymentStatus());
		dto.setPosition(employeeEntity.getPosition());
		dto.setRemainingLeave(employeeEntity.getRemainingLeave());
		dto.setSalary(employeeEntity.getSalary());
		dto.setSiraNo(employeeEntity.getSiraNo());
		dto.setUsedLeave(employeeEntity.getUsedLeave());
		dto.setWorkExperience(employeeEntity.getWorkExperience());
	    dto.setId(employeeEntity.getId()); 

		return dto;
	}

	@Override
	public List<EmployeeDTO> getallEmployessList() {

		List<EmployeeEntity> employee = repo.findAll();
        List<EmployeeDTO> dtos = new ArrayList<>();
        for(EmployeeEntity e : employee) {
        	dtos.add(convertEntityToDTO(e));
        }
        return dtos;
		
	}
	
	public void deleteEmployee(Long id) {
		EmployeeEntity entity = repo.findById(id)
					.orElseThrow(() -> new NoSuchElementException("Kayıt Bulunamadı"));
			entity.setStatus("0");
			repo.save(entity);		
	 }
	
	
/*public void deleteEmployee(Long id) {
    EmployeeEntity entity = repo.findById(id); 

    if (entity != null) { 
        entity.setStatus("0"); 
        repo.save(entity); 
    } else {
        throw new NoSuchElementException("Kayıt Bulunamadı");
    }
}*/
	
	 public List<EmployeeDTO> search(String keyword) {
	        List<EmployeeEntity> entities = repo.searchEmployees(keyword);
	        List<EmployeeDTO> dtos = new ArrayList<>();
	        for(EmployeeEntity e : entities) {
	            dtos.add(convertEntityToDTO(e));
	        }
	        return dtos;
	    
	}}

