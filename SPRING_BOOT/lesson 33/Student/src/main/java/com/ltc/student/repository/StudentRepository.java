package com.ltc.student.repository;

import com.ltc.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Find students by first name
    List<Student> findByFirstName(String firstName);

    // Find students by last name
    List<Student> findByLastName(String lastName);

    // Find a student by email
    Student findByEmail(String email);

    // Find students by age
    List<Student> findByAge(Integer age);

    // Find students within a specific age range
    List<Student> findByAgeBetween(Integer startAge, Integer endAge);

    // Find students by first name and last name
    List<Student> findByFirstNameAndLastName(String firstName, String lastName);

    // Custom query to find students by first name using JPQL
    @Query("SELECT s FROM Student s WHERE s.firstName = ?1")
    List<Student> findStudentsByFirstNameCustom(String firstName);

    // Custom query to find students by age greater than a specific value using JPQL
    @Query("SELECT s FROM Student s WHERE s.age > ?1")
    List<Student> findStudentsWithAgeGreaterThan(Integer age);

    // Custom query to find students by email using native SQL
    @Query(value = "SELECT * FROM student WHERE email = ?1", nativeQuery = true)
    Optional<Student> findStudentByEmailNative(String email);

}
