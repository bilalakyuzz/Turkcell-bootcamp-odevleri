package com.bilal.gun3odev3.DataAcces.Abstracts;

import com.bilal.gun3odev3.Entities.Category;
import com.bilal.gun3odev3.Entities.Course;
import com.bilal.gun3odev3.Entities.Teacher;

import java.util.List;

public interface DataService {
    void addCategory(Category category);
    List<Category> getAllCategory();
    void deleteCategory(int id);

    void addCourse(Course course);
    List<Course> getAllCourse();
    void deleteCourse(int id);

    void addTeacher(Teacher teacher);
    List<Teacher> getAllTeachers();
    void deleteTeacher(int id);
}
