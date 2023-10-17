package decorator.mediator;

import mediator.User;
import org.junit.Test;

/**
 * ClassName: MediatorTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class MediatorTest {
    @Test
    public void mediatorTest(){
        User bob = new User("Bob");
        User alice = new User("Alice");
        bob.sendMessage("Alice, I love you!");
        alice.sendMessage("Sorry Bob, I already have a boyfriend.");
        User joker = new User("Joker");
        joker.sendMessage("Haha, Bob, You and I are so similar");
    }
}
