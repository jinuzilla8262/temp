package org.example;

public class LifelineSite extends Site {

    protected double getTax(double base) {
        return base * Site.TAX_RATE * 0.2;
    }

    protected double getBase(double units, double rate) {
        return units * rate * 0.5;
    }

}
