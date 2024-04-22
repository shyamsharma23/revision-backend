package com.revisionapi.revisionreactapi.repository;

import com.revisionapi.revisionreactapi.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
//StudentRepository obj;
//obj.findById(id1)
//obj.save(newStudent)
//obj.findAll()
