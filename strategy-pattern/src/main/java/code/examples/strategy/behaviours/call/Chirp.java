package code.examples.strategy.behaviours.call;

public class Chirp implements Call {

    @Override
    public void call() {
        System.out.println("Chirp chirp...");
    }

}
