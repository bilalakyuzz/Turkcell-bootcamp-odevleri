package com.bilal.AbstractClass;

public class AbstractClassMain {
    public static void main(String[] args) {
        MaleGameCalculator maleGameCalculator = new MaleGameCalculator();
        maleGameCalculator.calculate();

        GameCalculator[] gameCalculators = new GameCalculator[] {new MaleGameCalculator(), new FemaleGameCalculator(), new KidGameCalculator()
                ,new ElderGameCalculator()};
        for (GameCalculator gameCalculator: gameCalculators) {
            gameCalculator.calculate();
        }

    }
}
