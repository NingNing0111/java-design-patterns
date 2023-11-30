package bridge;

/**
 * ClassName: LineStringDisplayImpl <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class LineStringDisplayImpl implements DisplayInterface{

    private String str;
    public LineStringDisplayImpl(String str){
        this.str = str;
    }

    @Override
    public void open() {

    }

    @Override
    public void print() {
        System.out.println(str);
    }

    @Override
    public void close() {

    }
}
