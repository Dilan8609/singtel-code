package singtel.animal.service.animals.birds;

import singtel.animal.service.actions.DefaultWalkableAction;
import singtel.animal.service.actions.Flyable;
import singtel.animal.service.actions.Singable;
import singtel.animal.service.actions.Walkable;
import singtel.animal.service.animals.Animal;

public class Bird extends Animal {
    private final Singable singable;
    private final Flyable flyable;

    private final Walkable walkable;

    public Bird(final Singable singable, final Flyable flyable) {
        this.singable = singable;
        this.flyable = flyable;
        walkable = new DefaultWalkableAction();
    }

    public void fly() {
        flyable.fly();
    }

    public void sing() {
        singable.sing();
    }

    public void walk() {
        walkable.walk();
    }
}
