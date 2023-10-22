package interpreter;

/**
 * ClassName: Sub <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class Sub extends Operator{
    Sub(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() - right.interpreter();
    }
}
