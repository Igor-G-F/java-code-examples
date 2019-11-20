package code.examples.strategy.behaviours.movement;

public class Fly implements Movement {

    @Override
    public void move() {
        System.out.println("Am flying, yay.");
    }

}
