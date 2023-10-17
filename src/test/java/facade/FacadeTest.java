package facade;

import org.junit.Test;

/**
 * ClassName: FacadeTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class FacadeTest {
    @Test
    public void facadeTest(){
        Facade facade = new Facade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }
}
