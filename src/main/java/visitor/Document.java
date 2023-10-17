package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Document <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class Document extends Element{

    List<Element> elementList = new ArrayList<>();

    public Document(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor visitor) {
        elementList.forEach( e -> e.accept(visitor));
    }
}
