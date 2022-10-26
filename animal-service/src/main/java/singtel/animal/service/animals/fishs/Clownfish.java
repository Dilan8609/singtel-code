package singtel.animal.service.animals.fishs;

import singtel.animal.service.actions.Swimmable;

public class Clownfish extends Fish {
    public Clownfish(Swimmable swimmable, String color, String size) {
        super(swimmable, color, size);
    }

    public void makeJokes() {
        System.out.println("joke");
    }
}
