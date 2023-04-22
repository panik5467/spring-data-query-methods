// Java Program to Illustrate DepartmentRepository File
  
// Importing package module to code fragment
package com.example.repository;
  
import com.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //List<Department> findByName(String name);
    Department findByName(String name);
    Department findTopByName(String name);

    Department findTopByNameAndCodeOrderByIdDesc(String name,String code);


}