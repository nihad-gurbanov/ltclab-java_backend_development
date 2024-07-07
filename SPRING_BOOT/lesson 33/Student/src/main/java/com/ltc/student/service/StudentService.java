package com.ltc.student.service;

import com.ltc.student.dto.StudentDto;
import com.ltc.student.entity.Student;
import com.ltc.student.exception.ResourceNotFoundException;
import com.ltc.student.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;
    private ModelMapper modelMapper;

    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students.stream()
                .map(item -> modelMapper.map(item, StudentDto.class))
                .toList();
    }

    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Student not found with id: " + id));

        return modelMapper.map(student, StudentDto.class);
    }

    public void addStudent(StudentDto student) {
        Student newStudent = modelMapper.map(student, Student.class);
        studentRepository.save(newStudent);
    }

    public void updateStudent(Long id, StudentDto updatedStudent) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Student not found with id: " + id));

        modelMapper.map(updatedStudent, student);
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Student not found with id: " + id));
                studentRepository.delete(student);
    }
}
