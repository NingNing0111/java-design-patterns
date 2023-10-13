package factoryMethod;

/**
 * ClassName: PhoneFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public abstract class PhoneFactory {
    abstract Phone makePhone(String model);
    abstract void registerPhone(Phone phone);
    Phone create(String model){
        Phone phone = makePhone(model);
        registerPhone(phone);
        return phone;
    }
}


