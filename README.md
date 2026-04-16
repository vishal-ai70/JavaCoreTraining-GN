# ☕ Java Training Programs

This repository contains Java training programs for beginners.
All programs are implemented using **Core Java concepts** and are organized day-wise for structured learning.

---

## 📅 Day 1 Programs

* Hello World Program
* Addition Program
* Subtraction Program
* Largest Number Finder
* Smallest Number Finder
* Reverse Number Check

---

## 📅 Day 2 Programs

* Arithmetic Operations (Add, Subtract, Multiply, Divide, Modulus)
* Employee Details Example
* College Student Example
* Employee Grade Example
* Employee Salary Calculation (Inheritance)
* Student Marks Example

---

## 📅 Day 3 Programs

* Abstraction (Bank abstract class and subclasses)
* Inheritance (Base and Derived classes)
* Constructor Overloading
* Method Overloading
* Exception Handling (try-catch-finally)

---

## 📅 Day 4 Programs

* Product Billing

---

## 🧾 Assignment: Result Processing System

### 📄 Description

A program to process student results based on marks entered by the user.

---

### 💡 Concepts Used

* Variables for storing student data
* Scanner class for user input
* Conditional logic for result evaluation
* Exception handling for error management

---

### 🧾 Sample Output

```
Name              Result
-------------------------
John              Pass
Alex              Fail
```

---

## 🚀 Concepts Covered

* Java Basics (Class, Variables, Data Types)
* Input and Output
* Conditional Statements (if-else)
* Loops (for, while)
* Exception Handling
* OOP Concepts:

  * Inheritance
  * Abstraction
  * Encapsulation

---
# 🎓 SmartCampus System

> A Java-based Campus Management System built as a Final Assessment Project
> **BTech 2nd Year — GNC College**

---

## 📌 What is this project?

SmartCampus is a console-based application that helps an Admin manage students, courses, and enrollments efficiently. It is built using core Java concepts like OOP, Collections, Exception Handling, and Multithreading.

---

## 👤 User Stories

| Role    | Goal                                      | Benefit                        |
|---------|-------------------------------------------|--------------------------------|
| Admin   | Manage students and courses               | Track enrollments efficiently  |
| System  | Handle errors and process asynchronously  | Keep the application reliable  |

---

## ⚙️ Functional Features

| #  | Feature                    | Description                                      |
|----|----------------------------|--------------------------------------------------|
| 1  | Add Student                | Register a new student with ID, name, email      |
| 2  | Add Course                 | Create a course with ID, name, and fee           |
| 3  | Enroll Student             | Link a student to one or more courses            |
| 4  | View Students              | Display all registered students                  |
| 5  | View Enrollments           | Display all student-course mappings              |
| 6  | Process Enrollment (Thread)| Run enrollment processing asynchronously         |
| 7  | Save to File *(Bonus)*     | Write all data to a `.txt` file                  |
| 8  | Read from File *(Bonus)*   | Read and display saved data from file            |
| 0  | Exit                       | Close the application                            |

---

## 🏗️ Project Structure

```
SmartCampusSystem.java
│
├── InvalidInputException      → Custom exception for bad inputs
├── Student                    → Entity: studentId, name, email
├── Course                     → Entity: courseId, courseName, fee
├── Enrollment                 → Links Student ↔ Course
├── EnrollmentProcessor        → Runnable thread for async processing
├── CampusManager              → Core logic: add, enroll, view, process
└── SmartCampusSystem          → Main class with menu-driven interface
```

---

## 🧠 Technical Concepts Used

| Concept              | Where Used                                      |
|----------------------|-------------------------------------------------|
| Classes & Objects    | Student, Course, Enrollment, CampusManager      |
| Constructors         | All entity classes use parameterized constructors|
| OOP (Encapsulation)  | Private fields with public getters              |
| Collections          | `HashMap` for students/courses, `ArrayList` for enrollments |
| Exception Handling   | `InvalidInputException`, try-catch blocks       |
| Multithreading       | `EnrollmentProcessor` implements `Runnable`     |
| File Handling        | `PrintWriter` to save, `BufferedReader` to read *(Bonus)* |

---

## 🚀 How to Run

### Step 1 — Compile
```bash
javac SmartCampusSystem.java
```

### Step 2 — Run
```bash
java SmartCampusSystem
```

### Step 3 — Use the Menu
```
--- MENU ---
1. Add Student
2. Add Course
3. Enroll Student
4. View Students
5. View Enrollments
6. Process Enrollments (Thread)
7. Save Data to File
8. Read Data from File
0. Exit
```

---

## 💡 Sample Usage

```
Enter student name: Rahul Sharma
Enter student email: rahul@gmail.com
Added: Student[ID=1, Name=Rahul Sharma, Email=rahul@gmail.com]

Enter course name: Java Programming
Enter course fee: 4999
Added: Course[ID=1, Name=Java Programming, Fee=$4999.0]

Enter Student ID: 1
Enter Course ID: 1
Enrolled: Rahul Sharma in Java Programming

[Thread: Thread-0] Processing: Enrollment[Student=Rahul Sharma, Course=Java Programming]
[Thread: Thread-0] Done processing: Enrollment[Student=Rahul Sharma, Course=Java Programming]
```

---

## 📂 Output File

When you choose **Save Data to File**, the system creates:
```
campus_data.txt
```
containing all students, courses, and enrollments in readable format.

---

## 🔒 Error Handling Examples

| Invalid Input              | Error Message                        |
|----------------------------|--------------------------------------|
| Empty student name         | `Student name cannot be empty.`      |
| Email without `@`          | `Invalid email: xyz`                 |
| Negative course fee        | `Fee cannot be negative.`            |
| Non-existent Student ID    | `Student ID 5 not found.`            |
| Duplicate enrollment       | `Already enrolled in this course.`   |

---

## 📋 Requirements

- Java 8 or above
- No external libraries needed
- Single `.java` file — easy to compile and run

---


* Java
* VS Code
* Git & GitHub

---

## 📂 Project Structure

```
JavaTrainingPrograms/
│
├── Day1Programs/
├── Day2Programs/
├── Day3Programs/
├── Assignment/
└── README.md
```

---

## ▶️ How to Run the Programs

### 🔹 Using Terminal

1. Open the project folder in VS Code
2. Open Terminal (**Ctrl + `**)
3. Compile and run the program:

```
javac FileName.java
java FileName
```

---

## 📝 Notes

* Ensure Java is installed on your system
* Use proper class structure
* Save programs in respective folders
* Follow naming conventions
* Use exception handling for input-based programs

---

## 👨‍💻 Created by Vishal Kumar
