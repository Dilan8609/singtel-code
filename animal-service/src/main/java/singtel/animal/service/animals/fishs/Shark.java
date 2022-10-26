package singtel.animal.service.animals.fishs;

import singtel.animal.service.actions.Swimmable;

public class Shark extends Fish {
    public Shark(Swimmable swimmable, String color, String size) {
        super(swimmable, color, size);
    }

    public void eatOtherFish() {
        System.out.println("eat");
    }
}
