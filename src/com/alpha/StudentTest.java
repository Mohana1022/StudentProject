package com.alpha;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        StudentServiceImpl service = new StudentServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Find Student");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Get All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    Student newStudent = new Student(id, name, age);
                    service.addStudent(newStudent);
                    break;

                case 2:
                    System.out.print("Enter ID to Find: ");
                    Student found = service.findStudent(sc.nextInt());
                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Student not found.");
                    break;

                case 3:
                    System.out.print("Enter ID to Update: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter New Name: ");
                    String newName = sc.next();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    Student updated = new Student(uid, newName, newAge);
                    service.updateStudent(updated);
                    break;

                case 4:
                    System.out.print("Enter ID to Remove: ");
                    service.removeStudent(sc.nextInt());
                    break;

                case 5:
                    service.getAllStudents();
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


