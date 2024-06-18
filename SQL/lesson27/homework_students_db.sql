-- Create Database
CREATE DATABASE HomeworkDB;

-- Create Students Table
CREATE TABLE Students (
    student_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);

-- Create Courses Table
CREATE TABLE Courses (
    course_id SERIAL PRIMARY KEY,
    course_name VARCHAR(100)
);

-- Create Enrollments Table
CREATE TABLE Enrollments (
    enrollment_id SERIAL PRIMARY KEY,
    student_id INT REFERENCES Students(student_id),
    course_id INT REFERENCES Courses(course_id)
);

-- Insert Records into Students Table
INSERT INTO Students (first_name, last_name) VALUES
    ('John', 'Doe'),
    ('Jane', 'Smith'),
    ('Michael', 'Johnson');

-- Insert Records into Courses Table
INSERT INTO Courses (course_name) VALUES
    ('Mathematics'),
    ('History');

-- Insert Records into Enrollments Table
INSERT INTO Enrollments (student_id, course_id) VALUES
    (1, 1),
    (2, 1),
    (2, 2),
    (3, 2),
    (3, 1);

-- Retrieve the first and last names of all students
SELECT first_name, last_name FROM Students;

-- List the course names
SELECT course_name FROM Courses;

-- Display the student names and the courses they are enrolled in
SELECT s.first_name, s.last_name, c.course_name
FROM Students s
JOIN Enrollments e ON s.student_id = e.student_id
JOIN Courses c ON e.course_id = c.course_id;

-- Count the number of enrollments
SELECT COUNT(*) AS num_enrollments FROM Enrollments;

-- Retrieve the student names, ordered by last name in ascending order
SELECT first_name, last_name
FROM Students
ORDER BY last_name ASC;

-- Count the total number of students
SELECT COUNT(*) AS total_students FROM Students;

-- List the student names and the total number of enrollments for each student
SELECT s.first_name, s.last_name, COUNT(e.enrollment_id) AS num_enrollments
FROM Students s
LEFT JOIN Enrollments e ON s.student_id = e.student_id
GROUP BY s.student_id;

-- Display the course names and the number of students enrolled in each course, but only include courses with more than 1 student
SELECT c.course_name, COUNT(e.student_id) AS num_students_enrolled
FROM Courses c
JOIN Enrollments e ON c.course_id = e.course_id
GROUP BY c.course_id
HAVING COUNT(e.student_id) > 1;

-- Retrieve the student names and the courses they are enrolled in, even if a student is not enrolled in any course
SELECT s.first_name, s.last_name, COALESCE(c.course_name, 'Not enrolled') AS course_name
FROM Students s
LEFT JOIN Enrollments e ON s.student_id = e.student_id
LEFT JOIN Courses c ON e.course_id = c.course_id;

-- Find the course names that have no enrollments
SELECT c.course_name
FROM Courses c
LEFT JOIN Enrollments e ON c.course_id = e.course_id
WHERE e.course_id IS NULL;

-- Calculate the average number of enrollments per student
SELECT AVG(num_enrollments) AS avg_enrollments_per_student
FROM (
    SELECT s.student_id, COUNT(e.enrollment_id) AS num_enrollments
    FROM Students s
    LEFT JOIN Enrollments e ON s.student_id = e.student_id
    GROUP BY s.student_id
) AS enrollment_counts;

-- List the student names and the courses they are enrolled in, only for students who are enrolled in more than one course
SELECT s.first_name, s.last_name, COUNT(e.course_id) AS num_courses_enrolled
FROM Students s
JOIN Enrollments e ON s.student_id = e.student_id
GROUP BY s.student_id
HAVING COUNT(e.course_id) > 1;
