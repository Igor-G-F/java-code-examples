package code.examples.strategy.creature;

import code.examples.strategy.behaviours.call.Chirp;
import code.examples.strategy.behaviours.movement.Fly;

public class Robin extends Bird {

    public Robin() {
        super(new Fly(), new Chirp());
    }

    @Override
    public void identify() {
        System.out.println("Am a robin!");
    }

}
