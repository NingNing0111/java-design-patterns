package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: Directory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public class Directory implements ComposeFileSafety {
    private String name;

    private List<ComposeFileSafety> directory = new ArrayList<>();
    public Directory(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<ComposeFileSafety> iterator = directory.iterator();
        while (iterator.hasNext()){
            ComposeFileSafety next = iterator.next();
            size += next.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<ComposeFileSafety> iterator = directory.iterator();
        while (iterator.hasNext()){
            ComposeFileSafety next = iterator.next();
            next.printList(prefix + "/" + name);
        }
    }

    public ComposeFileSafety add(ComposeFileSafety file){
        directory.add(file);
        return this;
    }

    @Override
    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
