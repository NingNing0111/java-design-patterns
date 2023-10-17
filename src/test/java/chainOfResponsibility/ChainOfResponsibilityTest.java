package chainOfResponsibility;

import org.junit.Test;

/**
 * ClassName: ChainOfResponsibilityTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class ChainOfResponsibilityTest {
    @Test
    public void chainOfResponsibilityTest(){
        NoSupport teacher = new NoSupport("Teacher");
        LimitSupport csdn = new LimitSupport("CSDN", 5);
        SpecialSupport friend = new SpecialSupport("friend", 6);
        OddSupport baidu = new OddSupport("BaiDu");
        LimitSupport google = new LimitSupport("Google", 20);
        // 设置责任链
        teacher.setNext(friend).setNext(baidu).setNext(csdn).setNext(google);

        for (int i = 0; i < 21; i++) {
            teacher.support(new Trouble(i));
        }
    }
}
