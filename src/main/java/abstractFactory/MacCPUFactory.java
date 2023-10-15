package abstractFactory;

import abstractFactory.product.CPU;
import abstractFactory.factory.CPUFactory;

/**
 * ClassName: MacCPUFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class MacCPUFactory implements CPUFactory {
    @Override
    public CPU createCPU() {
        CPU macCPU = new MacCPU();
        macCPU.info();
        return macCPU;
    }
}
