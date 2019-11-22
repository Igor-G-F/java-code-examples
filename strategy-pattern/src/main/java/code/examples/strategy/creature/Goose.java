package code.examples.strategy.creature;

public class Goose extends Bird {

    public Goose() {
        super(() -> System.out.println("Waddle waddle."), () -> System.out.println("Honk honk."));
    }

    @Override
    public void identify() {
        System.out.println("Lol, am a goose.");
    }

}
