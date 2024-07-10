package com.ltc.student.service;

import com.ltc.student.dto.request.TeacherRequestDto;
import com.ltc.student.dto.response.TeacherResponseDto;
import com.ltc.student.entity.Teacher;
import com.ltc.student.exception.ResourceNotFoundException;
import com.ltc.student.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeacherService {
    private final ModelMapper modelMapper;
    private TeacherRepository teacherRepository;

    public List<TeacherResponseDto> getAllTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();

        return teachers.stream()
                .map(teacher -> modelMapper.map(teacher, TeacherResponseDto.class))
                .toList();
    }

    public TeacherResponseDto getTeacherById(Long id) {
        Teacher teacher = teacherRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Teacher not found with id: " + id)
        );
        return modelMapper.map(teacher, TeacherResponseDto.class);
    }

    public void addTeacher(TeacherRequestDto teacherRequestDto) {
        Teacher teacher = modelMapper.map(teacherRequestDto, Teacher.class);
        teacherRepository.save(teacher);
    }

    public void updateTeacher(Long id, TeacherRequestDto teacherRequestDto) {
        Teacher teacher = teacherRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Teacher not found with id: " + id)
        );
        modelMapper.map(teacherRequestDto, teacher);
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        Teacher teacher = teacherRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Teacher not found with id: " + id)
        );
        teacherRepository.delete(teacher);
    }
}
