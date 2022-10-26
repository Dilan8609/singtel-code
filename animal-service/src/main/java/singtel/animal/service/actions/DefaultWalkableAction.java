package singtel.animal.service.actions;

public class DefaultWalkableAction implements Walkable {
    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
