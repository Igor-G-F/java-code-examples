package code.examples.decorator.beverage;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Our famous house blend!";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("1.20");
    }
}
