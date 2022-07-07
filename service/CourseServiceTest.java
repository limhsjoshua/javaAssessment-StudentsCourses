package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class CourseServiceTest {

    private final CourseService courseService = new CourseService();


    @org.junit.jupiter.api.Test
    void testGetCourse () throws ParseException {
        Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs" );
        Course course1 = new Course( "INTRO-CS-1", "Introduction to Computer Science", 9, module );
        courseService.registerCourse( course1 ); //unit test 2 is registering the course
        assertEquals(course1, courseService.getCourse(course1.getCode()));
    }


}