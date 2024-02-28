package com.bilal.InterfaceCustomer;

public class InterfaceMain {
    public static void main(String[] args) {
        CustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
