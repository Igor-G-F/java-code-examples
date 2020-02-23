package code.examples.decorator.beverage.condiment;

import code.examples.decorator.beverage.Beverage;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("0.20").add(beverage.getCost());
    }
}
