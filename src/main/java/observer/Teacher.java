package observer;

/**
 * ClassName: Teacher <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class Teacher extends Observable{
    private boolean isWrite;
    public void action(String event,boolean isWrite){
        System.out.println("老师正在" + event);
        // 获取观察者的状态
        notifyObservers(event,isWrite);
    }
}
