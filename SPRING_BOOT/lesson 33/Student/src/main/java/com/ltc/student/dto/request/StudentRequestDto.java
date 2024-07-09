package com.ltc.student.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDto {
    String firstName;
    String lastName;
    String email;
    Integer age;
}
