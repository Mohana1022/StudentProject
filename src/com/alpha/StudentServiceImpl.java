package com.alpha;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentImplimentation {

    List<Student> list = new ArrayList<>();

    public StudentServiceImpl() {
        // Default 3 students added to list
        list.add(new Student(1, "Arjun", 20));
        list.add(new Student(2, "Mohana", 22));
        list.add(new Student(3, "Deepak", 19));
    }

    @Override
    public void addStudent(Student s) {
    	
        list.add(s);
        System.out.println("Student added successfully.");
        
    }

    @Override
    public Student findStudent(int id) {
    	
        for (Student s : list) {
            if (s.getSid() == id) {
                return s;
            }
        }
        return null;
        
    }

    @Override
    public void updateStudent(Student updated) {
        
    }

    @Override
    public void removeStudent(int id) {
        
    }

    @Override
    public void deleteStudent(int id) {
        
    	
    }

    @Override
    public void getAllStudents() {
        
    }
}

