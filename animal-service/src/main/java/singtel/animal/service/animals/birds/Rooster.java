package singtel.animal.service.animals.birds;

import singtel.animal.service.actions.Flyable;
import singtel.animal.service.actions.Singable;

public class Rooster extends Chicken {
    public Rooster(Singable singable, Flyable flyable) {
        super(singable, flyable);
    }
}
