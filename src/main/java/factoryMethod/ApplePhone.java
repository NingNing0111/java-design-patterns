package factoryMethod;

/**
 * ClassName: ApplePhone <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class ApplePhone extends Phone{
    private String model;
    public ApplePhone(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    @Override
    void make() {
        System.out.println("phone model (" + model + ") is created");
    }
}
