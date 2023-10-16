package decorator;

/**
 * ClassName: Display <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public abstract class Display {
    abstract int getColumns(); // 获取列数（横向的字符数）
    abstract int getRows(); // 获取行数
    abstract String getRowText(int row);
    public final void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
