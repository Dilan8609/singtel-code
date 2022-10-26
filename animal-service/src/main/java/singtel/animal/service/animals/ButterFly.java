package singtel.animal.service.animals;

import singtel.animal.service.actions.Flyable;

public class ButterFly {
    private final Flyable flyable;

    public ButterFly(Flyable flyable) {
        this.flyable = flyable;
    }

    public void fly() {
        flyable.fly();
    }
}
