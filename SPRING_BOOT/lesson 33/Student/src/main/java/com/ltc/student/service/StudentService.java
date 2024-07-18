package com.ltc.student.service;

import com.ltc.student.dto.request.StudentRequestDto;
import com.ltc.student.dto.response.StudentResponseDto;
import com.ltc.student.entity.ClassNo;
import com.ltc.student.entity.Student;
import com.ltc.student.entity.Subject;
import com.ltc.student.entity.Teacher;
import com.ltc.student.exception.ResourceNotFoundException;
import com.ltc.student.repository.ClassNoRepository;
import com.ltc.student.repository.StudentRepository;
import com.ltc.student.repository.SubjectRepository;
import com.ltc.student.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class StudentService {
    private final SubjectRepository subjectRepository;
    private final StudentRepository studentRepository;
    private final ClassNoRepository classNoRepository;
    private final ModelMapper modelMapper;
    private final TeacherRepository teacherRepository;

    public List<StudentResponseDto> getAllStudents() {
        log.info("Fetching all students");
        List<Student> students = studentRepository.findAll();

        return students.stream()
                .map(student -> modelMapper.map(student, StudentResponseDto.class))
                .toList();
    }

    public StudentResponseDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Student not found with id: " + id));

        return modelMapper.map(student, StudentResponseDto.class);
    }

    public StudentResponseDto getStudentByEmail(String email) {
        Student student = studentRepository.findStudentByEmailNative(email).orElseThrow(
                () -> new ResourceNotFoundException("Student not found with email: " + email)
        );

        return modelMapper.map(student, StudentResponseDto.class);
    }

    public void addStudent(StudentRequestDto student) {
        Student newStudent = modelMapper.map(student, Student.class);
        ClassNo classNo = classNoRepository.findById(student.getClassId()).orElseThrow(
                () -> new ResourceNotFoundException("Class not found with id: " + student.getClassId()));
        newStudent.setClassNo(classNo);

        List<Long> teacherIds = student.getTeacherId();
        List<Teacher> teachers = new ArrayList<>();

        for (Long id : teacherIds){
            Teacher teacher = teacherRepository.findById(id).orElseThrow(
                    () -> new ResourceNotFoundException("Teacher not found with id: " + id)
            );
            teachers.add(teacher);

        }
        newStudent.setTeachers(teachers);

        List<Long> subjectIds = student.getSubjectId();
        List<Subject> subjects = new ArrayList<>();

        for (Long id : subjectIds){
            Subject subject = subjectRepository.findById(id).orElseThrow(
                    () -> new ResourceNotFoundException("Subject not found with id: " + id)
            );
            subjects.add(subject);
        }
        newStudent.setSubjects(subjects);
        studentRepository.save(newStudent);
    }

    public void updateStudent(Long id, StudentRequestDto updatedStudent) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Student not found with id: " + id));

        modelMapper.map(updatedStudent, student);
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Student not found with id: " + id));
        studentRepository.delete(student);
    }
}
