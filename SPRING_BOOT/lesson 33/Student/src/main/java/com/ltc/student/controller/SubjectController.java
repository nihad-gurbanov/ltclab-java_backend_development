package com.ltc.student.controller;

import com.ltc.student.dto.request.SubjectRequestDto;
import com.ltc.student.dto.response.SubjectResponseDto;
import com.ltc.student.entity.Subject;
import com.ltc.student.service.SubjectService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
@AllArgsConstructor
public class SubjectController {
    private final ModelMapper modelMapper;
    private SubjectService subjectService;

    @GetMapping("/get-all")
    public List<SubjectResponseDto> getAllSubjects() {
        List<Subject> subjects =  subjectService.getAllSubjects();
        return subjects.stream()
                .map(subject -> modelMapper.map(subject, SubjectResponseDto.class))
                .toList();
    }

    @GetMapping("/get/{id}")
    public SubjectResponseDto getSubjectById(@PathVariable Long id) {
        Subject subject = subjectService.getSubjectById(id);
        return modelMapper.map(subject, SubjectResponseDto.class);
    }

    @PostMapping("/add")
    public String create(@RequestBody SubjectRequestDto subjectRequestDto) {
        subjectService.addSubject(subjectRequestDto);
        return "success";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody SubjectRequestDto subjectRequestDto) {
        subjectService.updateSubject(id, subjectRequestDto);
        return "success";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        subjectService.deleteSubject(id);
        return "success";
    }
}
