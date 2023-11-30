package composite;

/**
 * ClassName: ComposeFileTransparent <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public abstract class ComposeFileTransparent {
    public abstract String getName();
    public abstract int getSize();
    public ComposeFileTransparent add(ComposeFileTransparent composeFileTransparent) throws Exception{
        throw new Exception();
    }
    public abstract void printList(String prefix);
    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
