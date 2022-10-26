package singtel.animal.service.animals.fishs;

import singtel.animal.service.actions.DefaultSwimmableAction;
import singtel.animal.service.actions.Swimmable;
import singtel.animal.service.animals.Animal;

public class Fish extends Animal {
   private final Swimmable swimmable;
   private final String color;

   private final String size;


    public Fish(final Swimmable swimmable, final String color, final String size) {
        this.swimmable = swimmable;
        this.color = color;
        this.size = size;
    }

    public void swim() {
        swimmable.swim();
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
