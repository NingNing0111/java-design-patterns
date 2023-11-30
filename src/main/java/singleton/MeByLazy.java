package singleton;

/**
 * ClassName: MeByLazy <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class MeByLazy {
    private static MeByLazy instance;
    private MeByLazy(){}
    public static MeByLazy getInstance(){
        if(instance == null){
            instance = new MeByLazy();
        }
        return instance;
    }

    public void run(){
        System.out.println("I can run.");
    }

    public void eat(){
        System.out.println("I can eat.");
    }
}
