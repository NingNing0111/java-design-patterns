package abstractFactory;

import abstractFactory.product.CPU;
import abstractFactory.factory.CPUFactory;

/**
 * ClassName: WindowsCPUFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class WindowsCPUFactory implements CPUFactory {
    @Override
    public CPU createCPU() {
        CPU windowsCPU = new WindowsCPU();
        windowsCPU.info();
        return windowsCPU;
    }
}
