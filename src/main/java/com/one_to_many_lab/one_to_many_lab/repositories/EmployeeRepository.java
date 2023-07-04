package com.one_to_many_lab.one_to_many_lab.repositories;

import com.one_to_many_lab.one_to_many_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
