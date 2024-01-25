package com.javalearning.springbooth2ex.repository;

import com.javalearning.springbooth2ex.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
