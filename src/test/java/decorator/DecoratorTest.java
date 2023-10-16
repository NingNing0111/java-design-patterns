package decorator;

import org.junit.Test;

/**
 * ClassName: DecoratorTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public class DecoratorTest {
    @Test
    public void decoratorTest(){
        Display s1 = new StringDisplay("Hello World!");
        Display s2 = new SideBorder(s1, '$');
        Display s3 = new FullBorder(s2);
        s1.show();
        s2.show();
        s3.show();

        Display s4 = new StringDisplay("Hello Java!");
        // 给s4左右两边加$符号
        s4 = new SideBorder(s4, '$');
        // 再给s4加两层全边框
        s4 = new FullBorder(s4);
        s4 = new FullBorder(s4);
        // 再给s4两边加一次'/'符号、两次$符号
        s4 = new SideBorder(s4,'/');
        s4 = new SideBorder(s4,'$');
        s4 = new SideBorder(s4,'$');
        // 在给s4加一层全边框
        s4 = new FullBorder(s4);
        s4.show();
    }
}
