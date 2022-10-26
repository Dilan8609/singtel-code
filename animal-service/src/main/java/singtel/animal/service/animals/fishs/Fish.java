package singtel.animal.service.animals.fishs;

import singtel.animal.service.actions.DefaultSwimmableAction;
import singtel.animal.service.actions.Swimmable;
import singtel.animal.service.animals.Animal;

public class Fish extends Animal {
   private final Swimmable swimmable;


    public Fish() {
        this.swimmable = new DefaultSwimmableAction();
    }

    public void swim() {
        swimmable.swim();
    }
}
