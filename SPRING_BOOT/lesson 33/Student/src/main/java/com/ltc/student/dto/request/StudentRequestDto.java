package com.ltc.student.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private Long classId;
    private List<Long> subjectId;
    private List<Long> teacherId;
}
