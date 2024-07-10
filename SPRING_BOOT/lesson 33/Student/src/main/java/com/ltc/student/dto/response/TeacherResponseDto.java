package com.ltc.student.dto.response;

import com.ltc.student.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeacherResponseDto {
    private Long teacherId;
    private String firstName;
    private String lastName;
    private String email;
    private List<Student> students;
}
