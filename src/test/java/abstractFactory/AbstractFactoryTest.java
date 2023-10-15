package abstractFactory;

import abstractFactory.factory.PCAbstractFactory;
import abstractFactory.product.CPU;
import abstractFactory.product.RAM;
import org.junit.Test;

/**
 * ClassName: AbstractFactoryTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class AbstractFactoryTest {
    @Test
    public void abstractFactoryTest(){
        PCAbstractFactory windowsPCFactory = new WindowsPCFactory();
        CPU cpu = windowsPCFactory.createCPU();
        RAM ram = windowsPCFactory.createRAM();

        PCAbstractFactory macPCFactory = new MacPCFactory();
        CPU cpu1 = macPCFactory.createCPU();
        RAM ram1 = macPCFactory.createRAM();
    }
}
