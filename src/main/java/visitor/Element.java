package visitor;

/**
 * ClassName: Element <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public abstract class Element {
    private String uuid;
    public Element(String uuid){
        this.uuid = uuid;
    }
    public String getUuid(){
        return uuid;
    }
    public abstract void accept(Visitor visitor);
}
