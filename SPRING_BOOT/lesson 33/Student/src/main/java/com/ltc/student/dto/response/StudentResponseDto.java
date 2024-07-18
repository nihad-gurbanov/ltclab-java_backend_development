package com.ltc.student.dto.response;

import com.ltc.student.entity.ClassNo;
import com.ltc.student.entity.Subject;
import com.ltc.student.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class StudentResponseDto {
    private Long studentId;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private ClassNo classNo;
    private List<Subject> subjects;
    private List<Teacher> teachers;
}
