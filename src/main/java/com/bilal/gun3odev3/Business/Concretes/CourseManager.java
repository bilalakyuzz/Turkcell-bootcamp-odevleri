package com.bilal.gun3odev3.Business.Concretes;

import com.bilal.gun3odev3.Business.Abstracts.CourseService;
import com.bilal.gun3odev3.Core.Abstracts.Logger;
import com.bilal.gun3odev3.DataAcces.Abstracts.DataService;
import com.bilal.gun3odev3.Entities.Course;

import java.util.ArrayList;
import java.util.List;


public class CourseManager implements CourseService {

    DataService dataService;

    List<Logger> loggers;


    public CourseManager(DataService dataService, List<Logger> loggers) {
        this.dataService = dataService;
        this.loggers = loggers;
    }

    ArrayList<Course> courses = new ArrayList<>();


    @Override
    public void addCourse(Course course) {
        //şart kontrollü ekleme yapıldı(Kurs ismi tekrar edemez ve kursun fiyatı 0 dan küçük olamaz)
        for (Course course1 : courses){
            if(course.getName().toLowerCase().matches(course1.getName().toLowerCase())){
                //course1.getName().matches(course.getName())
                System.out.println("Kurs eklenemedi(zaten bu kurs var)");
                listloger(course1.getName() + " Adlı Kurs zaten olduğundan dolayı eklenemedi");
                return;
            }
        }
        if(course.getUnitPrice() < 0){
            System.out.println("Kurs eklenemedi (kursun fiyatı 0 dan küçük olamaz)");
            listloger(course.getName() + " Adlı Kurs fiyatı 0 dan küçük olduğu için eklenmedi");
            return;
        }
        courses.add(course);
        dataService.addCourse(course);
        listloger( course.getName() + " Adlı Kurs eklendi");

    }

    @Override
    public List<Course> getAllCourse() {
        listloger("Tüm kurslar listelendi");
        return dataService.getAllCourse();
    }

    @Override
    public void deleteCourse(int id) {
        listloger(id + " id li kurs silindi");
        dataService.deleteCourse(id);
    }
    private void listloger(String data){
        for(Logger logger:loggers){
            logger.log(data);
        }
    }
}
