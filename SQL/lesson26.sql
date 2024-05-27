CREATE DATABASE student_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT,
    contact_details VARCHAR(100)
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100),
    credits INT,
    instructor VARCHAR(100)
);


INSERT INTO students (student_id, first_name, last_name, age, contact_details)
VALUES
(1, 'John', 'Doe', 22, 'john.doe@example.com'),
(2, 'Jane', 'Smith', 19, 'jane.smith@example.com'),
(3, 'Alice', 'Johnson', 21, 'alice.johnson@example.com'),
(4, 'Bob', 'Brown', 23, 'bob.brown@example.com'),
(5, 'Carol', 'Davis', 20, 'carol.davis@example.com');


INSERT INTO courses (course_id, course_name, credits, instructor)
VALUES
(101, 'Mathematics', 4, 'Dr. Alan Turing'),
(102, 'Physics', 3, 'Dr. Marie Curie'),
(103, 'Chemistry', 4, 'Dr. Dmitri Mendeleev'),
(104, 'Biology', 3, 'Dr. Charles Darwin'),
(105, 'Computer Science', 5, 'Dr. Ada Lovelace');


UPDATE students
SET contact_details = 'new.email@example.com'
WHERE student_id = 1;


DELETE FROM courses
WHERE course_id = 102;


SELECT * FROM students;
SELECT first_name, last_name, age FROM students;


SELECT * FROM courses
WHERE credits > 3
ORDER BY course_name ASC;


CREATE TABLE enrollments (
    student_id INT,
    course_id INT,
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

-- Insert some example enrollments
INSERT INTO enrollments (student_id, course_id)
VALUES
(1, 101),
(2, 103),
(3, 104),
(4, 105),
(5, 101),
(1, 105);


SELECT s.first_name, s.last_name, s.age
FROM students s
JOIN enrollments e ON s.student_id = e.student_id
WHERE s.age > 20 AND e.course_id = 101;


SELECT * FROM students;
SELECT * FROM courses;
SELECT * FROM enrollments;

