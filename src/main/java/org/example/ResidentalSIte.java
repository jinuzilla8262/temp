package org.example;

public class ResidentalSIte extends Site {

    public double getBillableAmount(double units, double rate){
        double base = getBase(units, rate);
        double tax = getTax(base);
        return base + tax;
    }

    public double getTax(double base) {
        return base * Site.TAX_RATE;
    }

    public double getBase(double units, double rate) {
        return units * rate;
    }
}
