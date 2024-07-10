package com.ltc.student.controller;

import com.ltc.student.dto.request.TeacherRequestDto;
import com.ltc.student.dto.response.TeacherResponseDto;
import com.ltc.student.entity.Teacher;
import com.ltc.student.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
@AllArgsConstructor
public class TeacherController {
    TeacherService teacherService;

    @GetMapping("/get-all")
    public List<TeacherResponseDto> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/get/{id}")
    public TeacherResponseDto getTeacherById(@PathVariable Long id) {
        return teacherService.getTeacherById(id);
    }

    @PostMapping("/add")
    public String create(@RequestBody TeacherRequestDto teacherRequestDto) {
        teacherService.addTeacher(teacherRequestDto);
        return "success";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody TeacherRequestDto teacherRequestDto) {
        teacherService.updateTeacher(id, teacherRequestDto);
        return "success";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return "success";
    }
}
