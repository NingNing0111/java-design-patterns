package factoryMethod;

import org.junit.Test;

/**
 * ClassName: FactoryMethodTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class FactoryMethodTest {
    @Test
    public void factoryMethodTest(){
        PhoneFactory applePhoneFactory = new ApplePhoneFactory();
        PhoneFactory xiaoMiPhoneFactory = new XiaoMiPhoneFactory();
        // 生产两部iPhone手机
        Phone phone10 = applePhoneFactory.create("iPhone 10");
        Phone phone11 = applePhoneFactory.create("iPhone 11");
        // 生产一部XiaoMi手机
        Phone phone = xiaoMiPhoneFactory.create("xiaomi 13");
    }
}
