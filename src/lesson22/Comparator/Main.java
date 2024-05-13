package lesson22.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Emma", 18, 12);
        Student student2 = new Student("David", 17, 11);
        Student student3 = new Student("Charlie", 16, 10);
        Student student4 = new Student("Alice", 17, 11);
        Student student5 = new Student("Bob", 18, 12);

        ArrayList<Student> studentList = new ArrayList<>();
        NameComparator nameComparator = new NameComparator();
        AgeComparator ageComparator = new AgeComparator();
        GradeComparator gradeComparator = new GradeComparator();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);


        System.out.println("Unordered list ➡️ ");
        printStudents(studentList);


        System.out.println("List ordered by name 🔽 ");
        studentList.sort(nameComparator);
        printStudents(studentList);


        System.out.println("List ordered by age 🔽 ");
        studentList.sort(ageComparator);
        printStudents(studentList);


        System.out.println("List ordered by grade 🔽 ");
        studentList.sort(gradeComparator);
        printStudents(studentList);
    }

    private static void printStudents(ArrayList<Student> students) {
        System.out.printf("%-25s %-25s %s%n", "Name", "Age", "Grade");
        for (Student student : students) {
            System.out.printf("%-25s %-25s %s%n", student.name, student.age, student.grade);
        }
        System.out.println();
    }
}
