package ovserver;

import observer.Student;
import observer.Teacher;
import org.junit.Test;

/**
 * ClassName: ObserverTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class ObserverTest {
    @Test
    public void observerTest(){


        Teacher teacher = new Teacher();
        Student xiaoMing = new Student("小明", "吃东西");
        Student xiaoGang = new Student("小刚", "看小说");
        Student xiaoNing = new Student("小宁", "牵女生手手");
        teacher.addObserver(xiaoMing);
        teacher.addObserver(xiaoGang);
        teacher.addObserver(xiaoNing);

        teacher.action("板书",true);

        teacher.action("讲解",false);
    }
}
