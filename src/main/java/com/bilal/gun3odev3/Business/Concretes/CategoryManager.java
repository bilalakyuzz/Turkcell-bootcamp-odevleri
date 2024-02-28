package com.bilal.gun3odev3.Business.Concretes;

import com.bilal.gun3odev3.Business.Abstracts.CategoryService;
import com.bilal.gun3odev3.Core.Abstracts.Logger;
import com.bilal.gun3odev3.DataAcces.Abstracts.DataService;
import com.bilal.gun3odev3.Entities.Category;

import java.util.ArrayList;
import java.util.List;


public class CategoryManager implements CategoryService {

    DataService dataService;
    List<Logger> loggers;

    public CategoryManager(DataService dataAcessService, List<Logger> loggers) {
        this.dataService = dataAcessService;
        this.loggers = loggers;
    }

    ArrayList<Category> categories = new ArrayList<Category>();

    @Override
    public void addCategory(Category category) {
        //şart kontrollü ekleme yapıldı(Kategori ismi tekrar edemez)
        for(Category category1:categories){
            if(category1.getName().toLowerCase().matches(category.getName().toLowerCase())){
                System.out.println("Kategori eklenemedi (zaten bu kategori var)");
                listloger(category.getName() +" Adlı Kategori zaten olduğundan dolayı eklenemedi ");
                return;
            }
        }
        categories.add(category);
        dataService.addCategory(category);
        listloger(category.getName() +" Adlı Kategori Eklendi.");
    }

    @Override
    public List<Category> getAllCategory() {
        listloger("Tüm kategoriler Listelendi");
        return dataService.getAllCategory();
    }

    @Override
    public void deleteCategory(int id) {
        listloger(id +" id li kategori silindi ");
        dataService.deleteCategory(id);
    }
    private void listloger(String data){
        for(Logger logger:loggers){
            logger.log(data);
        }
    }
}