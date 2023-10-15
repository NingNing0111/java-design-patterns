package abstractFactory;

import abstractFactory.product.CPU;

/**
 * ClassName: MacCPU <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class MacCPU implements CPU {
    @Override
    public void info() {
        System.out.println("This is CPU for Mac platform ");
    }
}
