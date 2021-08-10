package com.msoft.elearning.repositories;

import com.msoft.elearning.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String> {
}
