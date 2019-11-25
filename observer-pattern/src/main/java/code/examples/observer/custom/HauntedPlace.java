package code.examples.observer.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class HauntedPlace implements Subject {

    private CopyOnWriteArrayList<Observer> observers;
    private String cryptid;

    public HauntedPlace() {
        observers = new CopyOnWriteArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getClass().getSimpleName() + " left the party.");
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(cryptid);
        }
    }

    public String getCryptid() {
        return cryptid;
    }

    public void setCryptid(String cryptid) {
        this.cryptid = cryptid;
        System.out.println("A " + cryptid + " manifests itself.");
        notifyObservers();
    }

}
