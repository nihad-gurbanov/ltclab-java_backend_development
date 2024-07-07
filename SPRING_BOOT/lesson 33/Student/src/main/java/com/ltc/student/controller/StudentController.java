package com.ltc.student.controller;

import com.ltc.student.dto.StudentDto;
import com.ltc.student.entity.Student;
import com.ltc.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDto getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/")
    public String create(@RequestBody StudentDto student) {
        studentService.addStudent(student);
        return "success";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody StudentDto student) {
        studentService.updateStudent(id, student);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "success";
    }
}
