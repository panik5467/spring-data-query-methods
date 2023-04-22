// Java Program to Illustrate DepartmentServiceImpl File

// Importing package module to code fragment
package com.example.service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service

// Class
public class DepartmentServiceImpl
	implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	// Save operation
	@Override
	public Department saveDepartment(Department department)
	{
		return departmentRepository.save(department);
	}

	// Read operation
	@Override public List<Department> fetchDepartmentList()
	{
		return (List<Department>)
			departmentRepository.findAll();
	}

	// Update operation
	@Override
	public Department
	updateDepartment(Department department,
					Long departmentId)
	{
		Department depDB
			= departmentRepository.findById(departmentId)
				.get();

		if (Objects.nonNull(department.getName())
			&& !"".equalsIgnoreCase(
				department.getName())) {
			depDB.setName(
				department.getName());
		}

		if (Objects.nonNull(
				department.getAddress())
			&& !"".equalsIgnoreCase(
				department.getAddress())) {
			depDB.setAddress(
				department.getAddress());
		}

		if (Objects.nonNull(department.getCode())
			&& !"".equalsIgnoreCase(
				department.getCode())) {
			depDB.setCode(
				department.getCode());
		}

		return departmentRepository.save(depDB);
	}

	// Delete operation
	@Override
	public void deleteDepartmentById(Long departmentId)
	{
		departmentRepository.deleteById(departmentId);
	}
}
