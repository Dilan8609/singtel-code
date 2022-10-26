package singtel.animal.service.actions;

public class CluckSingableAction implements Singable {
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
