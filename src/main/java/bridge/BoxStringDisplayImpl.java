package bridge;

/**
 * ClassName: BoxStringDisplayImpl <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class BoxStringDisplayImpl implements DisplayInterface{

    private String string;
    private int length;

    public BoxStringDisplayImpl(String string){
        this.string = string;
        this.length = string.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine(){
        // 打印：+----------------+
        System.out.print("+");
        for (int i=0;i<this.length;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
