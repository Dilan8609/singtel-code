package singtel.animal.service.actions;

public class QuackSingableAction implements Singable {
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }
}
