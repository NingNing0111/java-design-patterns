package abstractFactory.factory;

import abstractFactory.product.RAM;

/**
 * ClassName: RAMFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public interface RAMFactory {
    // 创建RAM的接口
    RAM createRAM();
}
