package factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: XiaoMiPhoneFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class XiaoMiPhoneFactory extends PhoneFactory{

    private final List<XiaoMiPhone> phones = new ArrayList<>();
    @Override
    Phone makePhone(String model) {
        XiaoMiPhone xiaoMiPhone = new XiaoMiPhone(model);
        xiaoMiPhone.make();
        return xiaoMiPhone;
    }

    @Override
    void registerPhone(Phone phone) {
        phones.add((XiaoMiPhone) phone);
        System.out.println(((XiaoMiPhone)phone).getModel() + " is registered!");
    }
}
