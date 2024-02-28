package com.bilal.gun3odev3.DataAcces.Concretes;

import com.bilal.gun3odev3.DataAcces.Abstracts.DataService;
import com.bilal.gun3odev3.Entities.Category;
import com.bilal.gun3odev3.Entities.Course;
import com.bilal.gun3odev3.Entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class HibernateDao  implements DataService {

    //datas
    List<Category> categories = new ArrayList<Category>();
    List<Course> courses = new ArrayList<Course>();
    List<Teacher> teachers = new ArrayList<Teacher>();

    @Override
    public void addCategory(Category category) {
        categories.add(category);
        System.out.println("Hibernate ile category eklendi");
    }

    @Override
    public List<Category> getAllCategory() {
        System.out.println("Hibernate ile category listelendi");
        return categories;
    }

    @Override
    public void deleteCategory(int id) {

        for(Category category : categories){
            if(category.getId() == id){
                categories.remove(category);
                System.out.println("Hibernate ile category silindi");
                return;
            }
        }
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Hibernate ile course eklendi");
    }

    @Override
    public List<Course> getAllCourse() {
        System.out.println("Hibernate ile course listelendi");
        return courses;
    }

    @Override
    public void deleteCourse(int id) {
        for(Course course: courses){
            if(course.getId() == id){
                courses.remove(course);
                System.out.println("Hibernate ile course silindi");
                return;

            }
        }
    }

    @Override
    public void addTeacher(Teacher Teacher) {
        teachers.add(Teacher);
        System.out.println("Hibernate ile Teacher eklendi");
    }

    @Override
    public List<Teacher> getAllTeachers() {
        System.out.println("Hibernate ile Teacher listelendi");
        return teachers;
    }

    @Override
    public void deleteTeacher(int id) {
        for(Teacher Teacher:teachers){
            if(Teacher.getId() == id){
                teachers.remove(Teacher);
                System.out.println("Hibernate ile Teacher silindi");
                return;
            }
        }
    }
}
