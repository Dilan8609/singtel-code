package singtel.animal.service;

import singtel.animal.service.actions.DefaultSingableAction;
import singtel.animal.service.animals.birds.Bird;

public class Application {
    public static void main(String[] args) {
        Bird bird = new Bird(new DefaultSingableAction());
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
