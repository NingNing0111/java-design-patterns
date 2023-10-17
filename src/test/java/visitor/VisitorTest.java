package visitor;

import org.junit.Test;

import java.util.UUID;

/**
 * ClassName: VisitorTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class VisitorTest {
    @Test
    public void visitorTest(){
        Visitor elementVisitor = new ElementVisitor();

        Document document = new Document(UUID.randomUUID().toString());
        document.elementList.add(new XMLElement(UUID.randomUUID().toString()));
        document.elementList.add(new JSONElement(UUID.randomUUID().toString()));
        document.elementList.add(new JSONElement(UUID.randomUUID().toString()));

        document.accept(elementVisitor);
    }
}
