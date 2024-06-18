**Task 1: Setting up the Database**

1. Create a new database named "HomeworkDB".
2. Inside the database, create the following tables:
    
    **Table: Students**
    Columns:
    
    - student_id (Primary Key)
    - first_name
    - last_name
    
    **Table: Courses**
    Columns:
    
    - course_id (Primary Key)
    - course_name
    
    **Table: Enrollments**
    Columns:
    
    - enrollment_id (Primary Key)
    - student_id (Foreign Key referencing Students)
    - course_id (Foreign Key referencing Courses)

**Task 2: Data Insertion**

1. Insert at least 3 records into the Students table.
2. Insert at least 2 records into the Courses table.
3. Insert at least 5 records into the Enrollments table, associating students with different courses.

**Task 3: Basic SQL Queries**
Write SQL queries for the following tasks:

1. Retrieve the first and last names of all students.
2. List the course names.
3. Display the student names and the courses they are enrolled in.
4. Count the number of enrollments.

**Task 4: Sorting and Aggregation**

1. Retrieve the student names, ordered by last name in ascending order.
2. Count the total number of students.

**Task 5: Filtering and Grouping**

1. List the student names and the total number of enrollments for each student.
2. Display the course names and the number of students enrolled in each course, but only include courses with more than 1 student.

**Task 6: Joins and Sub-queries**

1. Retrieve the student names and the courses they are enrolled in, even if a student is not enrolled in any course.
2. Find the course names that have no enrollments.

**Task 7: Bonus - Aggregation and Filtering**

1. Calculate the average number of enrollments per student.
2. List the student names and the courses they are enrolled in, only for students who are enrolled in more than one course.


