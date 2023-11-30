package abstractFactory;

import abstractFactory.product.RAM;
import abstractFactory.factory.RAMFactory;

/**
 * ClassName: MacRAMFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class MacRAMFactory implements RAMFactory {
    @Override
    public RAM createRAM() {
        RAM macRAM = new MacRAM();
        macRAM.info();
        return macRAM;
    }
}
