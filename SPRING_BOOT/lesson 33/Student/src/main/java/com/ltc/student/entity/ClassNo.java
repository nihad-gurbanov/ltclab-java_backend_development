package com.ltc.student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}
