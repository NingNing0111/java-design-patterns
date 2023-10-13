package factoryMethod;

/**
 * ClassName: XiaoMiPhone <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class XiaoMiPhone extends Phone{
    private String model;
    public XiaoMiPhone(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    @Override
    void make() {
        System.out.println("phone model ("+model+") is created!");
    }
}
