package abstractFactory;

import abstractFactory.product.RAM;

/**
 * ClassName: WindowsRAM <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class WindowsRAM implements RAM {
    @Override
    public void info() {
        System.out.println("This is ARM for Windows platform ");
    }
}
