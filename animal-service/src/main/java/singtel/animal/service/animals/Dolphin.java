package singtel.animal.service.animals;

import singtel.animal.service.actions.Swimmable;

public class Dolphin {
    private final Swimmable swimmable;


    public Dolphin(Swimmable swimmable) {
        this.swimmable = swimmable;
    }

    public void swim() {
        swimmable.swim();
    }
}
