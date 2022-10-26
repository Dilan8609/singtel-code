package singtel.animal.service.animals.birds;

import singtel.animal.service.actions.Flyable;
import singtel.animal.service.actions.Singable;

public class Parrot extends Bird {
    public Parrot(Singable singable, Flyable flyable) {
        super(singable, flyable);
    }
}
