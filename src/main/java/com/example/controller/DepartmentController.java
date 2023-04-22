// Java Program to Demonstrate DepartmentController File

// Importing package module to code fragment
package com.example.controller;

import com.example.repository.DepartmentRepository;
import com.example.entity.Department;
import com.example.service.DepartmentService;
import java.util.List;
// Importing required classes
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController

// Class
public class DepartmentController {

	@Autowired private DepartmentService departmentService;
	@Autowired private DepartmentRepository repo;

	// Save operation
	@PostMapping("/departments")
	public Department saveDepartment(
		@Valid @RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}

	// Read operation
	@GetMapping("/name")
	//public List<Department> fetchDepartmentName()
	public Department fetchDepartmentName()
	{
		return repo.findByName("aaa");
	}

	// Read operation
	@GetMapping("/name1")
	public Department fetchDepartmentName1()
	{
		return repo.findTopByName("aaa");
	}
	// Read operation
	@GetMapping("/code")
	public Department fetchDepartmentCode()
	{
		return repo.findTopByNameAndCodeOrderByIdDesc("aaa","1");
	}

	// Read operation
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}

	// Update operation
	@PutMapping("/departments/{id}")
	public Department
	updateDepartment(@RequestBody Department department,
					@PathVariable("id") Long departmentId)
	{
		return departmentService.updateDepartment(
			department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id")
									Long departmentId)
	{
		departmentService.deleteDepartmentById(
			departmentId);

		return "Deleted Successfully";
	}
}
