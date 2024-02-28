package com.bilal.InterfaceCustomer;

public class MySqlCustomerDal implements CustomerDal, Repository{
    @Override
    public void add() {
        System.out.println("Added MySql");
    }
}