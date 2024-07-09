package com.ltc.student.controller;

import com.ltc.student.dto.request.StudentRequestDto;
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
    public List<StudentRequestDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentRequestDto getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/")
    public String create(@RequestBody StudentRequestDto student) {
        studentService.addStudent(student);
        return "success";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody StudentRequestDto student) {
        studentService.updateStudent(id, student);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "success";
    }
}
