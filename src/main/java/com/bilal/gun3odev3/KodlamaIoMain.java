package com.bilal.gun3odev3;

import com.bilal.gun3odev3.Business.Abstracts.TeacherService;
import com.bilal.gun3odev3.Business.Concretes.TeacherManager;
import com.bilal.gun3odev3.Core.Abstracts.Logger;
import com.bilal.gun3odev3.Core.Concretes.EmailLogger;
import com.bilal.gun3odev3.DataAcces.Concretes.HibernateDao;
import com.bilal.gun3odev3.Entities.Teacher;

import java.util.ArrayList;

public class KodlamaIoMain {
    public static void main(String[] args) {
        //eğitmenlerin tanımlanması
        Teacher teacher1 = new Teacher(1,"Fatih","bey");
        Teacher teacher2 = new Teacher(2,"Engin","Demirog");
        //loggerin tanımlanması

        ArrayList<Logger> loggers = new ArrayList<>();
        EmailLogger emailLogger=new EmailLogger();
        loggers.add(emailLogger);

        //Data acess in tanımlanması
        HibernateDao hibernateDao = new HibernateDao();
        //Teacher Manager in Tanımlanması
        TeacherManager teacherManager = new TeacherManager(hibernateDao,loggers);
        //Teacher ekleme
        teacherManager.addTeacher(teacher1);
        teacherManager.addTeacher(teacher2);
        //Teacher Listeleme
        System.out.println("=Silinmeden Önce=");
        for(Teacher teacher : teacherManager.getAllTeachers()){
            System.out.println("========================");
            System.out.println("Eğitmen  id : " + teacher.getId());
            System.out.println("Eğitmen  Adı : " + teacher.getName());
            System.out.println("Eğitmen  Soyadı : " + teacher.getlName());

        }
        //Instrutctor silme
        teacherManager.deleteTeacher(2);
        System.out.println("=Silindikten sonra=");
        for(Teacher teacher : teacherManager.getAllTeachers()){
            System.out.println("========================");
            System.out.println("Eğitmen  id : " + teacher.getId());
            System.out.println("Eğitmen  Adı : " + teacher.getName());
            System.out.println("Eğitmen  Soyadı : " + teacher.getlName());
        }
    }

}