package singtel.animal.service.animals.birds;

import singtel.animal.service.actions.Flyable;
import singtel.animal.service.actions.Singable;
import singtel.animal.service.animals.Animal;

public class Bird extends Animal {
    private final Singable singable;
    private final Flyable flyable;

    public Bird(final Singable singable, final Flyable flyable) {
        this.singable = singable;
        this.flyable = flyable;
    }

    public void fly() {
        flyable.fly();
    }

    public void sing() {
        singable.sing();
    }
}
