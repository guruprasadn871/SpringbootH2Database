package com.springboot.h2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.h2.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
