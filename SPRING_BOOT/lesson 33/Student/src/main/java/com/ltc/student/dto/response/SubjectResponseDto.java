package com.ltc.student.dto.response;

import com.ltc.student.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubjectResponseDto {
    private Long subjectId;
    private String subjectName;
    private String subjectWeight;
    private String subjectDescription;
    private List<Student> students;
}
