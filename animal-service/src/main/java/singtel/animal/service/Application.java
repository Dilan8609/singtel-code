package singtel.animal.service;

import singtel.animal.service.actions.*;
import singtel.animal.service.animals.birds.Bird;
import singtel.animal.service.animals.birds.Chicken;
import singtel.animal.service.animals.birds.Duck;
import singtel.animal.service.animals.birds.Rooster;

public class Application {
    public static void main(String[] args) {
        Bird bird = new Bird(new DefaultSingableAction(), new DefaultFlyableAction());
        bird.walk();
        bird.fly();
        bird.sing();

        Bird duck = new Duck(new QuackSingableAction(), new DefaultFlyableAction(), new DefaultSwimmableAction());
        duck.sing();
        duck.fly();
        ((Duck)duck).swim();

        Bird chicken = new Chicken(new CluckSingableAction(), new NoFlyableAction());
        chicken.sing();
        chicken.fly();

        Bird rooster = new Rooster(new CockADoodleSingableAction(), new NoFlyableAction());
        rooster.sing();
        rooster.fly();
    }
}
