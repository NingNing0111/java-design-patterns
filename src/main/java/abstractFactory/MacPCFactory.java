package abstractFactory;

import abstractFactory.factory.PCAbstractFactory;
import abstractFactory.product.CPU;
import abstractFactory.product.RAM;

/**
 * ClassName: MacPCFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class MacPCFactory implements PCAbstractFactory {
    @Override
    public CPU createCPU() {
        return new MacCPUFactory().createCPU();
    }

    @Override
    public RAM createRAM() {
        return new MacRAMFactory().createRAM();
    }
}
