package abstractFactory.factory;

import abstractFactory.product.CPU;

/**
 * ClassName: CPUFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public interface CPUFactory {
    // 创建CPU的接口
    CPU createCPU();
}
