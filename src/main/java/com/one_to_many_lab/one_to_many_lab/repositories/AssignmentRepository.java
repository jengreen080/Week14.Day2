package com.one_to_many_lab.one_to_many_lab.repositories;

import com.one_to_many_lab.one_to_many_lab.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
