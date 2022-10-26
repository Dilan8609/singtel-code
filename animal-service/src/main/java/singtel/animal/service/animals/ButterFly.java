package singtel.animal.service.animals;

import singtel.animal.service.actions.Flyable;
import singtel.animal.service.actions.Movable;

public class ButterFly {
    private Movable movable;

    public ButterFly(Movable movable) {
        this.movable = movable;
    }

    public void move() {
        movable.move();
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }
}
