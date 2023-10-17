package facade;

/**
 * ClassName: Rectangle <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a rectangle!");
    }
}
