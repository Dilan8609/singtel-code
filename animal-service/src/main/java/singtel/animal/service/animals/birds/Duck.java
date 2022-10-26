package singtel.animal.service.animals.birds;

import singtel.animal.service.actions.Flyable;
import singtel.animal.service.actions.Singable;
import singtel.animal.service.actions.Swimmable;

public class Duck extends Bird {

    public final Swimmable swimmable;
    public Duck(final Singable singable, final Flyable flyable, final Swimmable swimmable) {
        super(singable, flyable);
        this.swimmable = swimmable;
    }

    public void swim() {
        swimmable.swim();
    }
}
