package interpreter;

import org.junit.Test;

/**
 * ClassName: InterpreterTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class InterpreterTest {
    @Test
    public void interpreterTest(){
        String expression1 = "一加一";
        String expression2 = "四加二减一";
        Calculator calculator = new Calculator();
        int calculator1 = calculator.calculator(expression1);
        int calculator2 = calculator.calculator(expression2);
        System.out.println(expression1 + "等于" + calculator1);
        System.out.println(expression2 + "等于" + calculator2);
    }
}
