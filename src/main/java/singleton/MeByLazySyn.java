package singleton;

/**
 * ClassName: MeByLazySyn <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class MeByLazySyn {
    private static MeByLazySyn instance;
    private MeByLazySyn(){}
    public static MeByLazySyn getInstance(){
        synchronized (MeByLazySyn.class){
            if(instance == null){
                instance = new MeByLazySyn();
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
