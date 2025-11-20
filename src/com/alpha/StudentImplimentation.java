package com.alpha;

public interface StudentImplimentation {
	
	void addStudent(Student s);

    Student findStudent(int id);

    void updateStudent(Student s);

    void removeStudent(int id);

    void deleteStudent(int id);

    void getAllStudents();
    
}

