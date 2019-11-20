package code.examples.strategy.creature;

import code.examples.strategy.behaviours.call.Call;
import code.examples.strategy.behaviours.movement.Movement;

public abstract class Bird {

    private Movement movement;
    private Call call;

    Bird(Movement movement, Call call) {
        this.movement = movement;
        this.call = call;
    }

    public void move() {
        movement.move();
    }

    public void call() {
        call.call();
    }

    /**
     * Creature identifies itself.
     */
    public abstract void identify();
}
