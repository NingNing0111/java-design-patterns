package composite;

/**
 * ClassName: File <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public class File implements ComposeFileSafety {

    private String name;
    private int size;

    public File(String name,int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
