package singleton;

/**
 * ClassName: MeByInnerClass <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class MeByInnerClass {
    private static class MeByInnerClassHolder {
        public static MeByInnerClass instance = new MeByInnerClass();
    }
    private MeByInnerClass(){}

    public static MeByInnerClass getInstance(){
        return MeByInnerClassHolder.instance;
    }

    public void run(){
        System.out.println("I can run.");
    }

    public void eat(){
        System.out.println("I can eat.");
    }
}
