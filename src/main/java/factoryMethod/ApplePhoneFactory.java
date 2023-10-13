package factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ApplePhoneFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class ApplePhoneFactory extends PhoneFactory{
    private final List<ApplePhone> phones = new ArrayList<>();
    @Override
    Phone makePhone(String model) {
        ApplePhone applePhone = new ApplePhone(model);
        applePhone.make();
        return applePhone;
    }

    @Override
    void registerPhone(Phone phone) {
        phones.add((ApplePhone) phone);
        System.out.println(((ApplePhone) phone).getModel() + " is registered!");
    }
}
