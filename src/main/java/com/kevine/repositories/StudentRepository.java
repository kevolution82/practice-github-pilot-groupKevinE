package com.kevine.repositories;

import com.kevine.practice_github_pilot_group.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional query methods can be defined here if needed
    // For example, to find a student by name:
    // List<Student> findByName(String name);
}