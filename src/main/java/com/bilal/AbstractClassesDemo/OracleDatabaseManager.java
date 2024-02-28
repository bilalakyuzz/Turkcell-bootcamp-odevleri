package com.bilal.AbstractClassesDemo;

public class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data obtained from: Oracle");
    }
}
