package abstractFactory.factory;

import abstractFactory.product.CPU;
import abstractFactory.product.RAM;

/**
 * ClassName: PCAbstractFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public interface PCAbstractFactory {
    CPU createCPU();
    RAM createRAM();
}
