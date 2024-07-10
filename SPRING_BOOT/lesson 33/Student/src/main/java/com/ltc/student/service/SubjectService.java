package com.ltc.student.service;

import com.ltc.student.dto.request.SubjectRequestDto;
import com.ltc.student.entity.Subject;
import com.ltc.student.exception.ResourceNotFoundException;
import com.ltc.student.repository.SubjectRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubjectService {
    private SubjectRepository subjectRepository;
    private ModelMapper modelMapper;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Subject with id " + id + " not found")
        );
    }

    public void addSubject(SubjectRequestDto subjectRequestDto) {
        Subject subject = modelMapper.map(subjectRequestDto, Subject.class);
        subjectRepository.save(subject);
    };

    public void updateSubject(Long id, SubjectRequestDto subjectRequestDto) {
        Subject subject = subjectRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Subject with id " + id + " not found")
        );
        modelMapper.map(subjectRequestDto, subject);
        subjectRepository.save(subject);
    };

    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    };
}
