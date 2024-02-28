package com.bilal.gun3odev3.Business.Abstracts;

import com.bilal.gun3odev3.Entities.Course;

import java.util.List;

public interface CourseService {
    void addCourse(Course course);
    List<Course> getAllCourse();
    void deleteCourse(int id);
}
