package com.ltc.person.dto;


import lombok.*;

//@Data
@Getter
@Setter
//@EqualsAndHashCode
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
@Builder
public class PersonDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
}
