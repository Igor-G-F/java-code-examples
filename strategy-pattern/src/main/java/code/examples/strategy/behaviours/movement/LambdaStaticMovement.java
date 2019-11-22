package code.examples.strategy.behaviours.movement;

public interface LambdaStaticMovement extends Movement {

    static Movement flyMovement() {
        return () -> System.out.println("Am flying, yay.");
    }

    static Movement swimMovement() {
        return () -> System.out.println("Am swimming, blub, blub....");
    }

    static Movement waddleMovement() {
        return () -> System.out.println("Waddle waddle.");
    }
}
