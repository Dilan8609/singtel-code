package singtel.animal.service.animals.birds;

import singtel.animal.service.actions.Flyable;
import singtel.animal.service.actions.Singable;

public class Chicken extends Bird {
    public Chicken(Singable singable, Flyable flyable) {
        super(singable, flyable);
    }
}
