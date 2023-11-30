package abstractFactory;

import abstractFactory.product.CPU;

/**
 * ClassName: WindowsCPU <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class WindowsCPU implements CPU {
    @Override
    public void info() {
        System.out.println("This is CPU for Windows platform ");
    }
}
