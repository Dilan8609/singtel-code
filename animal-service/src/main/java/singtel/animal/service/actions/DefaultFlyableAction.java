package singtel.animal.service.actions;

public class DefaultFlyableAction implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
