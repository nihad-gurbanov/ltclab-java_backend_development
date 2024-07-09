package com.ltc.student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "subject")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subject_id")
    private Long subjectId;
    @Column(name = "subject_name")
    private String subjectName;
    @Column(name = "subject_weight")
    private String subjectWeight;
    @Column(name = "subject_description")
    private String subjectDescription;
}
