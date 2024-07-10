package com.ltc.student.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

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

    @ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Student> students;
}
