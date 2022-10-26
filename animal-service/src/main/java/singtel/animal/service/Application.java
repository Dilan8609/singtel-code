package singtel.animal.service;

import singtel.animal.service.actions.*;
import singtel.animal.service.animals.birds.*;
import singtel.animal.service.animals.fishs.Fish;

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

        Bird dogParrot = new Parrot(new WoofSingableAction(), new DefaultFlyableAction());
        dogParrot.sing();
        dogParrot.fly();

        Bird catParrot = new Parrot(new MeowSingableAction(), new DefaultFlyableAction());
        catParrot.sing();
        catParrot.fly();

        Bird roosterParrot = new Parrot(new CockADoodleSingableAction(), new DefaultFlyableAction());
        roosterParrot.sing();
        roosterParrot.fly();

        Fish fish = new Fish();
        fish.swim();
    }
}
