package singleton;

/**
 * ClassName: MeByHungry <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class MeByHungry {
    private static MeByHungry instance = new MeByHungry();
    private MeByHungry(){}
    public static MeByHungry getInstance(){
        return instance;
    }

    public void run(){
        System.out.println("I can run.");
    }

    public void eat(){
        System.out.println("I can eat.");
    }
}
