package com.bilal.gun3odev3.Business.Concretes;

import com.bilal.gun3odev3.Business.Abstracts.TeacherService;
import com.bilal.gun3odev3.Core.Abstracts.Logger;
import com.bilal.gun3odev3.DataAcces.Abstracts.DataService;
import com.bilal.gun3odev3.Entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager implements TeacherService {

    DataService dataService;

    List<Logger> loggers;

    public TeacherManager(DataService dataService, List<Logger> loggers) {
        this.dataService = dataService;
        this.loggers = loggers;
        //eğitmenlerimizi sahte veritabanımıza ekliyoruz

    }
    ArrayList<Teacher> Teachers = new ArrayList<Teacher>();
    @Override
    public void addTeacher(Teacher Teacher) {
        listloger(Teacher.getName() + " Adlı eğitmen eklendi");
        Teachers.add(Teacher);
        dataService.addTeacher(Teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        listloger("Tüm Eğitmenler Listelendi");
        return  dataService.getAllTeachers();
    }

    @Override
    public void deleteTeacher(int id) {
        listloger( id + " id li eğitmen silindi");
        dataService.deleteTeacher(id);
    }
    private void listloger(String data){
        for(Logger logger:loggers){
            logger.log(data);
        }
    }
}