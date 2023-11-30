package facade;

/**
 * ClassName: Circle <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a circle!");
    }
}
