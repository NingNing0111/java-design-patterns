package prototype;

import org.junit.Test;

/**
 * ClassName: PrototypeTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/13 0013
 * @since JDK 11
 */
public class PrototypeTest {

    @Test
    public void prototypeTest(){
        Client client = new Client();
        client.register("surround by *",new SurroundSout('*'));
        client.register("under by -",new UnderSout('-'));
        Product product = client.create("surround by *");
        Product product1 = client.create("under by -");
        product.use("Hello World!");
        product1.use("Hello Java!");
    }
}
