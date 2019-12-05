package code.examples.observer;

import code.examples.observer.custom.AverageJoe;
import code.examples.observer.custom.BraveHunter;
import code.examples.observer.custom.HauntedPlace;
import code.examples.observer.custom.ScaredKid;

public class ObserverApplication {

    public static void main(String[] args) {
        HauntedPlace place = new HauntedPlace();
        new BraveHunter(place);
        AverageJoe averageJoe = new AverageJoe(place);
        new ScaredKid(place);

        place.setCryptid("Zombie");
        place.setCryptid("tax man");
        place.setCryptid("Man in Black");
        place.registerObserver(averageJoe);
        place.setCryptid("Spring heeled Jack!");
    }
}
