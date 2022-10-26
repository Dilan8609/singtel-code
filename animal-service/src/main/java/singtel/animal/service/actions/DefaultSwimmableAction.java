package singtel.animal.service.actions;

public class DefaultSwimmableAction implements Swimmable {
    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
