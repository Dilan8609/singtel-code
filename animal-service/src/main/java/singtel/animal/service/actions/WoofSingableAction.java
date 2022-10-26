package singtel.animal.service.actions;

public class WoofSingableAction implements Singable {
    @Override
    public void sing() {
        System.out.println("Woof, woof");
    }
}
