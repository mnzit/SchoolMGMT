package com.sudreeshya.day17.dao.impl;

import com.sudreeshya.day17.dao.StudentDao;
import com.sudreeshya.day17.model.Course;
import com.sudreeshya.day17.model.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class StudentDaoMemoryImpl implements StudentDao {

    @Override
    public List<Student> fetchAllStudents() {

        List<Student> students = new ArrayList<>();

        Student student = new Student();
        student.setId(1L);
        student.setFirstname("Ramesh");
        student.setLastname("Karki");
        student.setContactNo("9818623397");
        student.setAddress("Sunakothi");
        student.setCreatedDate(new Date());

        Course course = new Course(1L, "BIT", new Date());
        student.setCourse(course);

        students.add(student);

        student = new Student();
        student.setId(2L);
        student.setFirstname("Kraamesh");
        student.setLastname("Maharjan");
        student.setContactNo("9818623399");
        student.setAddress("Jumla");
        student.setCreatedDate(new Date());

        course = new Course(2L, "BCA", new Date());
        student.setCourse(course);

        students.add(student);

        return students;
    }

    @Override
    public Student fetchStudentById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean saveStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean updateStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteStudentById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
