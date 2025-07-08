package com.kevine.repositories;

import com.kevine.practice_github_pilot_group.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // Additional query methods can be defined here if needed
    // For example, to find a teacher by name:
    // List<Teacher> findByName(String name);
}