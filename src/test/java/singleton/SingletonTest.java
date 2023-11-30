package singleton;

import org.junit.Test;

/**
 * ClassName: SingletonTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/12 0012
 * @since JDK 11
 */
public class SingletonTest {

    @Test
    public void hungryTest(){
        MeByHungry instance = MeByHungry.getInstance();
        instance.eat();
        instance.run();
    }

    @Test
    public void lazyTest(){
        MeByLazy instance = MeByLazy.getInstance();
        instance.eat();
        instance.run();
    }

    @Test
    public void lazySynTest(){
        MeByLazySyn instance = MeByLazySyn.getInstance();
        instance.eat();
        instance.run();
    }

    @Test
    public void lazySynDoubleTest(){
        MeByLazySynDouble instance = MeByLazySynDouble.getInstance();
        instance.eat();
        instance.run();
    }

    @Test
    public void lazyInnerClassTest(){
        MeByInnerClass instance = MeByInnerClass.getInstance();
        instance.eat();
        instance.run();
    }
}
