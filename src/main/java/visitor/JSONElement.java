package visitor;

/**
 * ClassName: JSONElement <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class JSONElement extends Element{
    public JSONElement(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
