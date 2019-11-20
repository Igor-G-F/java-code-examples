package code.examples.strategy.creature;

import code.examples.strategy.behaviours.call.Quack;
import code.examples.strategy.behaviours.movement.Swim;

public class Duck extends Bird {

    public Duck() {
        super(new Swim(), new Quack());
    }

    @Override
    public void identify() {
        System.out.println("I'm a duck.");
    }

}
