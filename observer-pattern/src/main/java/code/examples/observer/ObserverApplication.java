package code.examples.observer;

import code.examples.observer.custom.AverageJoe;
import code.examples.observer.custom.BraveHunter;
import code.examples.observer.custom.HauntedPlace;
import code.examples.observer.custom.ScaredKid;

public class ObserverApplication {

    public static void main(String[] args) {
        HauntedPlace place = new HauntedPlace();
        BraveHunter braveHunter = new BraveHunter(place);
        AverageJoe averageJoe = new AverageJoe(place);
        ScaredKid scaredKid = new ScaredKid(place);

        place.setCryptid("Zombie");
        place.setCryptid("tax man");
        place.setCryptid("Man in Black");
        place.setCryptid("Spring heeled Jack!");
    }
}
