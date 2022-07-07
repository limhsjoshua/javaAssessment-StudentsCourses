package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>(); // key is studentid, value is student object

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    } // add student to students map

    public Student findStudent( String studentId ) // find student by id
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId ) //check if student is subscribed
    {
        //TODO implement this method
        for (Student student : students.values()) {
            if (student.getId().equals(studentId))
                return true;
        }
        return false;
    }

    public void showSummary() // show summary of students and courses they are subscribed to
    {
        for ( String key : students.keySet() ){
            Student student = students.get(key);
        System.out.println("Student Summary: " + student); //printing out values of student hashmap (printing out all students registered)
    }}

    public void enrollToCourse( String studentId, Course course )  //puts that course into student's list of courses
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
