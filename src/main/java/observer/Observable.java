package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Observable <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class Observable {
    private List<Observer> observerList = new ArrayList<>();
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
    public void notifyObservers(String event,boolean isWrite){
        observerList.forEach( e -> e.update(event,isWrite));
    }
}
