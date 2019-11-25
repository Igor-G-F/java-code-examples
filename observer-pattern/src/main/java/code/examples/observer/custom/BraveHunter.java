package code.examples.observer.custom;

public class BraveHunter implements Hunter, Observer {

    private Subject location;

    public BraveHunter(Subject location) {
        this.location = location;
        location.registerObserver(this);
    }

    @Override
    public void action(String cryptid) {
        System.out.println("Brave hunter attacks the " + cryptid);
    }

    @Override
    public void update(String cryptid) {
        action(cryptid);
    }

}
