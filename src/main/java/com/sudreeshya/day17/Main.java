package com.sudreeshya.day17;

import com.sudreeshya.day17.dao.impl.CourseDaoDatabaseImpl;
import com.sudreeshya.day17.dao.impl.StudentDaoDatabaseImpl;
import com.sudreeshya.day17.dao.impl.StudentDaoMemoryImpl;
import com.sudreeshya.day17.dto.StudentDTO;
import com.sudreeshya.day17.model.Student;
import com.sudreeshya.day17.service.StudentService;
import com.sudreeshya.day17.service.impl.StudentServiceImpl;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Slf4j
public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentServiceImpl(
                new StudentDaoDatabaseImpl(new CourseDaoDatabaseImpl()));
// READ
//        List<Student> students = studentService.getAllStudents();
//
//        log.info("Students are : {}", students);
// CREATE
//        StudentDTO studentDTO = StudentDTO
//                .builder()
//                .firstname("Jignesh")
//                .lastname("Mhzrn")
//                .address("Amrca")
//                .contactNo("1231231")
//                .courseId(2L)
//                .build();
//        
//        studentService.saveStudent(studentDTO);
// UPDATE
//        StudentDTO studentDTO = StudentDTO
//                .builder()
//                .firstname("Jignesh")
//                .lastname("Shrestha")
//                .courseId(2L)
//                .build();
//        
//        studentService.updateStudent(studentDTO, 7L);

        studentService.deleteStudent(3L);

    }

}
