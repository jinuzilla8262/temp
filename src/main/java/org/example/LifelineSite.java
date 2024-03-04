package org.example;

public class LifelineSite extends Site {

    public  double getBillableAmount(double units, double rate) {
        double base = units * rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

}
