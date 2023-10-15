package abstractFactory;

import abstractFactory.factory.PCAbstractFactory;
import abstractFactory.product.CPU;
import abstractFactory.product.RAM;

/**
 * ClassName: WindowsPCFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class WindowsPCFactory implements PCAbstractFactory {
    @Override
    public CPU createCPU() {
        return new WindowsCPUFactory().createCPU();
    }

    @Override
    public RAM createRAM() {
        return new WindowsRAMFactory().createRAM();
    }
}
