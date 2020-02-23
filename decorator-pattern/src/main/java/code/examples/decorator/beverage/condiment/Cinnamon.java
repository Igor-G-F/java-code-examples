package code.examples.decorator.beverage.condiment;

import code.examples.decorator.beverage.Beverage;

import java.math.BigDecimal;

public class Cinnamon extends CondimentDecorator {

    Beverage beverage;

    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cinnamon";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("0.40").add(beverage.getCost());
    }
}
