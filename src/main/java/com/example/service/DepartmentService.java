// Java Program to Demonstrate DepartmentService File
  
// Importing required package to code fragment
package com.example.service;
  
import com.example.entity.Department;
// Importing required classes
import java.util.List;
  
// Interface
public interface DepartmentService {
  
    // Save operation
    Department saveDepartment(Department department);
  
    // Read operation
    List<Department> fetchDepartmentList();
  
    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);
  
    // Delete operation
    void deleteDepartmentById(Long departmentId);
}