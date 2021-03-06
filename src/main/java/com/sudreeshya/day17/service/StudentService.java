package com.sudreeshya.day17.service;

import com.sudreeshya.day17.dto.StudentDTO;
import com.sudreeshya.day17.model.Student;
import java.util.List;

/**
 *
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public interface StudentService {
    
    List<Student> getAllStudents();
    
    Student getStudentById(Long id);
    
    void saveStudent(StudentDTO studentDTO);
    
    void updateStudent(StudentDTO studentDTO, Long id);
    
    void deleteStudent(Long id);
   
}
