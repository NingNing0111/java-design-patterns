package flyweight;

import org.junit.Test;

/**
 * ClassName: FlyweightTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class FlyweightTest {
    private static final String colors[] = {"red","blue","white","black"};
    @Test
    public void flyweightTest(){

        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) FlyweightFactory.getCircle(getColor());
            circle.setRadius(getRadius());
            circle.draw();
        }
    }

    public String getColor(){
        return colors[(int) (Math.random() * colors.length)];
    }
    public double getRadius(){
        return Math.random() * 100;
    }
}
