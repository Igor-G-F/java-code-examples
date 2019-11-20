package code.examples.strategy.behaviours.call;

public class Mute implements Call {

    @Override
    public void call() {
        System.out.println("...");
    }

}
