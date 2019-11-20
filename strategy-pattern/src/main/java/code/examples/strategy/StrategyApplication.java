package code.examples.strategy;

import code.examples.strategy.creature.Bird;
import code.examples.strategy.creature.Duck;
import code.examples.strategy.creature.Robin;
import java.util.ArrayList;
import java.util.List;

public class StrategyApplication {

    public static void main(String[] args) {
        System.out.println(args);

        List<Bird> birds = new ArrayList<>();
        birds.add(new Duck());
        birds.add(new Robin());
        birds.add(new Duck());

        for (Bird bird : birds) {
            bird.call();
            bird.move();
            System.out.println("Tis me!");
            bird.identify();
        }

    }
}
