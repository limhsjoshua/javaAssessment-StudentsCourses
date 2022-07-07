package com.generation.service;

import com.generation.model.Student;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;


public class StudentServiceTest {



    private final StudentService studentService = new StudentService();
    DateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");


    @org.junit.jupiter.api.Test
    void testSubscribeStudent () throws ParseException {
        Student student1 = new Student("001", "John", "john@gmail.com", formatter.parse("02/01/2000"));
        studentService.subscribeStudent(student1);
        String student1id = student1.getId();
        assertEquals(student1, studentService.findStudent(student1id));
    }

    @org.junit.jupiter.api.Test
    void testFindStudent () throws ParseException {
        Student student2 = new Student("002", "Jane", "jane@gmail.com", formatter.parse("03/03/1994"));
        studentService.subscribeStudent(student2);
        assertEquals(student2, studentService.findStudent("002"));
    }

}