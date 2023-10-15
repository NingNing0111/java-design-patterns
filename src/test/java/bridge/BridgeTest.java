package bridge;

import org.junit.Test;

/**
 * ClassName: BridgeTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class BridgeTest {
    @Test
    public void displayTest(){
        CountDisplay countDisplay1 = new CountDisplay(new BoxStringDisplayImpl("Hello Java!"));
        countDisplay1.countDisplay(5);
        CountDisplay countDisplay2 = new CountDisplay(new LineStringDisplayImpl("This is a text!"));
        countDisplay2.countDisplay(3);
        HTMLDisplay htmlDisplay = new HTMLDisplay(new LineStringDisplayImpl("This is a span text!"));
        htmlDisplay.display("span");
        HTMLDisplay htmlDisplay1 = new HTMLDisplay(new BoxStringDisplayImpl("I won"));
        htmlDisplay1.display("h1");
    }
}
