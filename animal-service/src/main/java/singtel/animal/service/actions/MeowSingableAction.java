package singtel.animal.service.actions;

public class MeowSingableAction implements Singable {
    @Override
    public void sing() {
        System.out.println("Meow");
    }
}
