package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: DirectoryTran <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public class DirectoryTran extends ComposeFileTransparent{

    private List<ComposeFileTransparent> directory = new ArrayList<>();
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public DirectoryTran(String name){
        this.name = name;
    }

    @Override
    public int getSize() {
        Iterator<ComposeFileTransparent> iterator = directory.iterator();
        int size = 0;
        while (iterator.hasNext()){
            ComposeFileTransparent next = iterator.next();
            int nextSize = next.getSize();
            size += nextSize;
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);

        for (Iterator<ComposeFileTransparent> iterator = directory.iterator();iterator.hasNext();){
            ComposeFileTransparent next = iterator.next();
            next.printList(prefix + "/" + name);
        }
    }
    public ComposeFileTransparent add(ComposeFileTransparent composeFileTransparent){
        directory.add(composeFileTransparent);
        return this;
    }
}
