package com.bilal.InterfaceCustomer;

public class OracleCustomerDal implements CustomerDal, Repository{
    @Override
    public void add() {
        System.out.println("Added Oracle");
    }
}
