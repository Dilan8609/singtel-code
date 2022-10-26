package singtel.animal.service.animals.birds;

import org.junit.Test;
import org.mockito.Mockito;
import singtel.animal.service.actions.DefaultFlyableAction;
import singtel.animal.service.actions.Singable;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void sing() {
        Singable singable = Mockito.mock(Singable.class);
        Bird bird = new Bird(singable, new DefaultFlyableAction());
        bird.sing();
        Mockito.verify(singable, Mockito.times(1)).sing();
    }
}