package singtel.animal.service.animals.birds;

import singtel.animal.service.actions.Singable;
import singtel.animal.service.animals.Animal;

public class Bird extends Animal {
    private final Singable singable;

    public Bird(Singable singable) {
        this.singable = singable;
    }

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        singable.sing();
    }
}
