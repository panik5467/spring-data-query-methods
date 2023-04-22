package com.example.entity;
  
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
  
// Importing required classes 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
  
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
  
// Class  
public class Department {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      
    private Long id;
    private String name;
    private String address;
    private String code;
}