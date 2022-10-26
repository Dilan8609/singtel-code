package singtel.animal.service.actions;

public class NoFlyableAction implements Flyable {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
