package interpreter;

/**
 * ClassName: Operator <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public abstract class Operator implements Expression {
    Expression left;
    Expression right;
    Operator(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }
}
