package code.examples.decorator.beverage;

import java.math.BigDecimal;

public abstract class Beverage {

    String description = "This is a beverage";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal getCost();

}
