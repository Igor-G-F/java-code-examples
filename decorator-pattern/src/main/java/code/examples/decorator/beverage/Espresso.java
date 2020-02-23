package code.examples.decorator.beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Strong Espresso!";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("2.20");
    }
}
