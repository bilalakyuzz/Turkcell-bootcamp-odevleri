package com.bilal.gun3odev3.Business.Abstracts;

import com.bilal.gun3odev3.Entities.Teacher;

import java.util.List;

public interface TeacherService {
    void addTeacher(Teacher teacher);
    List<Teacher> getAllTeachers();
    void deleteTeacher(int id);
}
