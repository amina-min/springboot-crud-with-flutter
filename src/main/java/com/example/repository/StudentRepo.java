package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.StudentModel;


@Repository
public interface StudentRepo extends CrudRepository<StudentModel, Integer> {

}
