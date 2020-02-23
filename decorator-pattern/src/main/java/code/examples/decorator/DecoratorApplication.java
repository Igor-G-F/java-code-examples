package code.examples.decorator;

import code.examples.decorator.beverage.Beverage;
import code.examples.decorator.beverage.Espresso;
import code.examples.decorator.beverage.HouseBlend;
import code.examples.decorator.beverage.condiment.Cinnamon;
import code.examples.decorator.beverage.condiment.Milk;
import code.examples.decorator.beverage.condiment.Mocha;

public class DecoratorApplication {

    public static void main(String[] args) {

        /*
            The Decorator Pattern attaches additional responsibilities to an object dynamically.
            Decorators provide a flexible alternative to subclassing for extending functionality.
         */

        /*
            - Decorators have the same supertype as the objects they decorate.

            - You can use one or more decorators to wrap an object.

            - Given that the decorator has the same supertype as the object it decorates, we can pass
              around a decorated object in place of the original (wrapped) object.

            - The decorator adds its own behavior either before and/or after delegating to the object it
              decorates to do the rest of the job.

            - Objects can be decorated at any time, so we can decorate objects dynamically at runtime
              with as many decorators as we like.
         */

        Beverage beverage = new Cinnamon(new Mocha(new Espresso()));
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        Beverage beverage1 = new Cinnamon(new Milk(new HouseBlend()));
        System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());
    }
}
