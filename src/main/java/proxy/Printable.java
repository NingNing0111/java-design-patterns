package proxy;

/**
 * ClassName: Printable <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public interface Printable {
    void setPrintName(String name);
    String getPrintName();
    void print(String name);
}
