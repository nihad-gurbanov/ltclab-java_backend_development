package com.ltc.student.dto.response;

import com.ltc.student.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClassNoResponseDto {
    private Long classId;
    private String className;
    private String classGroup;
    private String description;
    private List<Student> students;

}
