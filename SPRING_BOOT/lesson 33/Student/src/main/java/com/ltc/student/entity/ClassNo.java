package com.ltc.student.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="class_no")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClassNo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;
    @Column(name = "class_name")
    private String className;
    @Column(name = "class_group")
    private String classGroup;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "classNo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Student> students;

}
