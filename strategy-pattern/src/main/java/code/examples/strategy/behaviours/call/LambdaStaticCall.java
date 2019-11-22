package code.examples.strategy.behaviours.call;

public interface LambdaStaticCall extends Call {

    static Call squeakCall() {
        return () -> System.out.println("Squeak squeak.");
    }

    static Call chirpCall() {
        return () -> System.out.println("Chirp chirp...");
    }
}
