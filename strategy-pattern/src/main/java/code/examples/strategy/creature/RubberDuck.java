package code.examples.strategy.creature;

import static code.examples.strategy.behaviours.call.LambdaStaticCall.squeakCall;
import static code.examples.strategy.behaviours.movement.LambdaStaticMovement.swimMovement;

public class RubberDuck extends Bird {

    public RubberDuck() {
        super(swimMovement(), squeakCall());
    }

    @Override
    public void identify() {
        System.out.println("Am a rubber DUCK!");
    }

}
