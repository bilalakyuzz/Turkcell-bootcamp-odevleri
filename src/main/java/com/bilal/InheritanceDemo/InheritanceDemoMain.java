package com.bilal.InheritanceDemo;

public class InheritanceDemoMain {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new AgricultureCreditManager());
    }
}
