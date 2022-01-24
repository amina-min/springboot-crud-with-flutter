package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.EmployeeModel;

public interface EmpRepo extends CrudRepository<EmployeeModel, Long> {

}
