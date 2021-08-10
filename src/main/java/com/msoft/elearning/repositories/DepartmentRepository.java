package com.msoft.elearning.repositories;

import com.msoft.elearning.models.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Integer> {
}
