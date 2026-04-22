package com.sultanbahadir.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sultanbahadir.dto.EmployeeDTO;
import com.sultanbahadir.entites.EmployeeEntity;
import com.sultanbahadir.shared.IEmployeeServices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:4200")  // Angular portu
public class EmployeeController {
    @Autowired
    private IEmployeeServices iEmployeeServices;

    @GetMapping("/list")
    public List<EmployeeDTO> getAllEmployees() {
        return iEmployeeServices.getallEmployessList();
    }

    @PostMapping("/saveOrupdate")
    public EmployeeDTO saveOrupdate(@RequestBody EmployeeDTO employeeDTO) {
        return iEmployeeServices.saveOrupdate(employeeDTO);
    }
    
    @DeleteMapping("/delete/{id}")
	public void DeleteEmployee (@PathVariable Long id) {
    	iEmployeeServices.deleteEmployee(id);
}
    @GetMapping("/search")
    public List<EmployeeDTO> search(@RequestParam("keyword") String keyword) {
        return iEmployeeServices.search(keyword);
    }


        
    
}
