package abstractFactory;

import abstractFactory.product.RAM;
import abstractFactory.factory.RAMFactory;

/**
 * ClassName: WindowsRAMFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class WindowsRAMFactory implements RAMFactory {
    @Override
    public RAM createRAM() {
        RAM windowsRAM = new WindowsRAM();
        windowsRAM.info();
        return windowsRAM;
    }
}
