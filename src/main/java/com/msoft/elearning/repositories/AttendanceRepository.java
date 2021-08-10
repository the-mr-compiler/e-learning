package com.msoft.elearning.repositories;

import com.msoft.elearning.models.Attendance;
import org.springframework.data.repository.CrudRepository;

public interface AttendanceRepository extends CrudRepository<Attendance,Long> {
}
