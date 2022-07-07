package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();   //list of courses that student is enrolled to

    private final Map<String, Course> approvedCourses = new HashMap<>(); //get.code(), course   key(course.code), value(course).
    //courses that students have been approved for

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }
// student constructor
    public void enrollToCourse( Course course ) //add
    {
        //adds students to course
        courses.add( course );
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }

    public boolean isCourseApproved( String courseCode )
    {
        //tells us if student has been approved for a course

        if (approvedCourses.containsKey( courseCode )) //if courseCode is in approvedCourses, return true
        {
            return true;
        }
        return false;
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses( Course course )
    {
        //TODO implement this method
        return null;
    }

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        for (Course course : courses) {
             if (course.getCode().equals(courseCode))
                return true;
                    }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {
        //TODO implement this method
        //get all courses that student has been approved for
        if (approvedCourses.size() == 0)
            return null;
        else
        {
            List<Course> approvedCoursesList = new ArrayList<>();
            for (String key : approvedCourses.keySet())
            {
                approvedCoursesList.add(approvedCourses.get(key));
            }
            return approvedCoursesList;
        }
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
