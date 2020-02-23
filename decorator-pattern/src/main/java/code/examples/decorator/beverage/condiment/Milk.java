package code.examples.decorator.beverage.condiment;

import code.examples.decorator.beverage.Beverage;

import java.math.BigDecimal;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("0.30").add(beverage.getCost());
    }
}
