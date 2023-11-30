package visitor;

/**
 * ClassName: Visitor <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public interface Visitor {
    void visit(JSONElement jsonElement);
    void visit(XMLElement xmlElement);
}
