package proxy;

import org.junit.Test;

/**
 * ClassName: ProxyTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class ProxyTest {
    @Test
    public void proxyTest(){
        Proxy proxy = new Proxy();
        proxy.print("Alice");
        proxy.print("Bob");
    }
}
