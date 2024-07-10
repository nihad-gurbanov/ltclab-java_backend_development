package com.ltc.student.service;

import com.ltc.student.dto.request.ClassNoRequestDto;
import com.ltc.student.dto.response.ClassNoResponseDto;
import com.ltc.student.entity.ClassNo;
import com.ltc.student.exception.ResourceNotFoundException;
import com.ltc.student.repository.ClassNoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClassNoService {
    private final ModelMapper modelMapper;
    private ClassNoRepository classNoRepository;

    public List<ClassNoResponseDto> getAllClassNos() {
        List<ClassNo> classNos = classNoRepository.findAll();

        return classNos.stream()
                .map(classNo -> modelMapper.map(classNo, ClassNoResponseDto.class))
                .toList();
    }

    public ClassNoResponseDto getClassNoById(Long id) {
        ClassNo classNo =  classNoRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("ClassNo not found with id: " + id)
        );

        return modelMapper.map(classNo, ClassNoResponseDto.class);
    }

    public void addClassNo(ClassNoRequestDto classNoRequestDto) {
        ClassNo newClass = modelMapper.map(classNoRequestDto, ClassNo.class);
        classNoRepository.save(newClass);
    }

    public void updateClassNo(Long id, ClassNoRequestDto classNoRequestDto) {
        ClassNo classNo = classNoRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("ClassNo not found with id: " + id)
        );
        modelMapper.map(classNoRequestDto, classNo);
        classNoRepository.save(classNo);
    }

    public void deleteClassNoById(Long id) {
        classNoRepository.deleteById(id);
    }
}
