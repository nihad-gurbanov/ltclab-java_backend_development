package com.ltc.student.controller;

import com.ltc.student.dto.request.StudentRequestDto;
import com.ltc.student.dto.response.StudentResponseDto;
import com.ltc.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/get-all")
    public List<StudentResponseDto> getAllStudents() {

        return studentService.getAllStudents();
    }

    @GetMapping("/get/{id}")
    public StudentResponseDto getStudentById(@PathVariable Long id) {

        return studentService.getStudentById(id);
    }

//    @GetMapping("name/{name}")
//    public StudentRequestDto getStudentByName(@PathVariable String name) {
//        return studentService.getStudentByName(name);
//    }

    @PostMapping("/add")
    public String create(@RequestBody StudentRequestDto student) {
        studentService.addStudent(student);
        return "success";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody StudentRequestDto student) {
        studentService.updateStudent(id, student);
        return "success";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "success";
    }
}
