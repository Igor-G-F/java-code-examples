package code.examples.strategy.behaviours.call;

public class Quack implements Call {

    @Override
    public void call() {
        System.out.println("Quack quack!");
    }

}
