package abstractFactory;

import abstractFactory.product.RAM;

/**
 * ClassName: MacRAM <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class MacRAM implements RAM {
    @Override
    public void info() {
        System.out.println("This is RAM for Mac platform ");
    }
}
