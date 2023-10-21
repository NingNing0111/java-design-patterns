package observer;

/**
 * ClassName: Observer <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public interface Observer {
    void update(String event,boolean isWrite);
}
