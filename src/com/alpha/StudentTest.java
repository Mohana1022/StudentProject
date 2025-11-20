package com.alpha;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentServiceImpl si = new StudentServiceImpl();

        boolean flag = true;
        while (flag) {

            System.out.println("1. Add Student");
            System.out.println("2. Find Student");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Get All Students");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    si.addStudent(new Student(id, name, age));
                    System.out.println("Student Added!");
                }
                    break;

                case 2:
                {
                    System.out.print("Enter ID to find: ");
                    Student found = si.findStudent(sc.nextInt());
                    System.out.println(found != null ? found : "Student Not Found");
                }
                    break;

                case 3:
                {
                	 System.out.print("Enter ID to update: ");
                     int uid = sc.nextInt();
                     System.out.print("Enter New Name: ");
                     String uname = sc.next();
                     System.out.print("Enter New Age: ");
                     int uage = sc.nextInt();
                     si.updateStudent(new Student(uid, uname, uage));

                	
                }
                    break;

                case 4:
                {
                	  System.out.print("Enter ID to remove: ");
                      si.removeStudent(sc.nextInt());

                   
                }
                    break;

                case 5:
                {
                    
                }
                    break;

                case 6:
                {
                    
                }
                    break;

                case 7:
                {
                    System.out.println("Thank You......");
                    flag = false;
                }

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}


