package composite;

import org.junit.Test;

/**
 * ClassName: ComposeTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public class ComposeTest {
    @Test
    public void composeSafeTest(){
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        Directory ningDir = new Directory("ning");
        File file = new File("get-docker.sh", 100);
        File python = new File("python", 200);
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        usrDir.add(ningDir);
        binDir.add(python);
        ningDir.add(file);
        rootDir.printList("");
    }

    @Test
    public void composeTranTest() throws Exception {
        DirectoryTran rootDir = new DirectoryTran("root");
        DirectoryTran binDir = new DirectoryTran("bin");
        DirectoryTran tmpDir = new DirectoryTran("tmp");
        DirectoryTran usrDir = new DirectoryTran("usr");
        DirectoryTran ningDir = new DirectoryTran("ning");
        FileTran file = new FileTran("get-docker.sh", 100);
        FileTran python = new FileTran("python", 200);
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        usrDir.add(ningDir);
        binDir.add(python);
        ningDir.add(file);
        rootDir.printList("");
    }
}
