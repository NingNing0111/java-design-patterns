package singleton;

/**
 * ClassName: MeByLazySynDouble <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class MeByLazySynDouble {
    private static MeByLazySynDouble instance;
    private MeByLazySynDouble(){}
    public static MeByLazySynDouble getInstance(){
        if(instance == null){
            synchronized (MeByLazySynDouble.class){
                if(instance == null){
                    instance = new MeByLazySynDouble();
                }
            }
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
