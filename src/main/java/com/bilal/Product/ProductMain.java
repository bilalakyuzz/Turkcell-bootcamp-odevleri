package com.bilal.Product;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus",3000,2,"Siyah");
        //Product product = new Product();
        //product.setName("Laptop");
        //product.setId(1);
        //product.setDescription("Asus Laptop");
       // product.setPrice(5000);
        //product.setStockAmount(3);

        ProductManager productManager=new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());

    }

}