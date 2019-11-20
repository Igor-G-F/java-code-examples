package code.examples.strategy.behaviours.movement;

public class Swim implements Movement {

    @Override
    public void move() {
        System.out.println("Am swimming, blub, blub....");
    }

}
