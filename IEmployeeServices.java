package com.sultanbahadir.shared;

import java.util.List;

import com.sultanbahadir.dto.EmployeeDTO;
import com.sultanbahadir.entites.EmployeeEntity;

public interface IEmployeeServices {

	public EmployeeDTO saveOrupdate (EmployeeDTO employeeDTO);
	
	List<EmployeeDTO> getallEmployessList();
	public void deleteEmployee(Long id);
	List<EmployeeDTO> search(String keyword);	
}
