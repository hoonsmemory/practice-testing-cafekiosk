package sample.cafekiosk.unit.beverage;

import lombok.*;

@ToString
public class Latte implements Beverage {

    @Override
    public String getName() {
        return "라떼";
    }

    @Override
    public int getPrice() {
        return 4500;
    }

}