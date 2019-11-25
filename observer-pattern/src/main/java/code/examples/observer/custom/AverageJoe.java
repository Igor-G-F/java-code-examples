package code.examples.observer.custom;

public class AverageJoe implements Hunter, Observer {

    private Subject location;

    public AverageJoe(Subject location) {
        this.location = location;
        location.registerObserver(this);
    }

    @Override
    public void action(String cryptid) {
        System.out.println("Average Joe stares at the " + cryptid + " in disbelief.");
    }

    @Override
    public void update(String cryptid) {
        if(cryptid.equals("tax man")) {
            location.removeObserver(this);
        } else {
            action(cryptid);
        }
    }

}
