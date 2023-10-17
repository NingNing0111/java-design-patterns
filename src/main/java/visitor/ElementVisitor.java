package visitor;

/**
 * ClassName: ElementVisitor <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class ElementVisitor implements Visitor{
    @Override
    public void visit(JSONElement jsonElement) {
        System.out.println("This is a Json element with uuid: "+jsonElement.getUuid());
    }

    @Override
    public void visit(XMLElement xmlElement) {
        System.out.println("This is a Xml element with uuid: " + xmlElement.getUuid());
    }
}
