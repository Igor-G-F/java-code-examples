package code.examples.observer.custom;

public class ScaredKid implements Hunter, Observer {

    private Subject location;

    public ScaredKid(Subject location) {
        this.location = location;
        location.registerObserver(this);
    }

    @Override
    public void action(String cryptid) {
        System.out.println("Scared kid looks away from the " + cryptid);
    }

    @Override
    public void update(String cryptid) {
        action(cryptid);
    }

}
