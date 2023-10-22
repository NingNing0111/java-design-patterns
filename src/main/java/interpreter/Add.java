package interpreter;

/**
 * ClassName: Add <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class Add extends Operator{
    Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() + right.interpreter();
    }
}
