package flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: FlyweightFactory <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class FlyweightFactory {
    private static final Map<String,IShape> circleMap = new ConcurrentHashMap<String,IShape>();

    public static IShape getCircle(String color){
        IShape circle = circleMap.get(color);
        if ( circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("创建了一个颜色为" + color + "的圆。");
        }
        return circle;
    }
}
