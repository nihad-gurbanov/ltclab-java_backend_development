package com.ltc.student.controller;

import com.ltc.student.dto.request.ClassNoRequestDto;
import com.ltc.student.dto.response.ClassNoResponseDto;
import com.ltc.student.service.ClassNoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/class-nos")
@AllArgsConstructor
public class ClassNoController {
    private final ModelMapper modelMapper;
    private ClassNoService classNoService;

    @GetMapping("/get-all")
    public List<ClassNoResponseDto> getAllClassNos() {
        return classNoService.getAllClassNos();
    }

    @GetMapping("/get/{id}")
    public ClassNoResponseDto getClassNoById(@PathVariable Long id) {
        return classNoService.getClassNoById(id);
    }

    @PostMapping("/add")
    public String create(@RequestBody ClassNoRequestDto classNoRequestDto) {
        classNoService.addClassNo(classNoRequestDto);
        return "success";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody ClassNoRequestDto classNoRequestDto) {
        classNoService.updateClassNo(id, classNoRequestDto);
        return "success";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        classNoService.deleteClassNoById(id);
        return "success";
    }

}
