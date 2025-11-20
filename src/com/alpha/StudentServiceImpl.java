package com.alpha;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentImplementation {

    List<Student> list = new ArrayList<>();

    public StudentServiceImpl() {
        list.add(new Student(1, "Arjun", 20));
        list.add(new Student(2, "Mohana", 22));
        list.add(new Student(3, "Deepak", 19));
    }

    @Override
    public void addStudent(Student s) {
        list.add(s);
    }

    @Override
    public Student findStudent(int id) {
        for (Student s : list) {
            if (s.getSid() == id)
                return s;
        }
        return null;
    }

    @Override
    public void updateStudent(Student updated) {
        for (Student s : list) {
            if (s.getSid() == updated.getSid()) {
                s.setSname(updated.getSname());
                s.setSage(updated.getSage());
                System.out.println("Student Updated Successfully");
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    @Override
    public void removeStudent(int id) {
        list.removeIf(s -> s.getSid() == id);
        System.out.println("Student Removed");
    }

    @Override
    public void deleteStudent(int id) {
        Student s = findStudent(id);
        if (s != null) {
            list.remove(s);
            System.out.println("Student Deleted Successfully");
        } else {
            System.out.println("Student Not Found");
        }
    }

    @Override
    public void getAllStudents() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

	
}

