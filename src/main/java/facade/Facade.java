package facade;

/**
 * ClassName: Facade <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class Facade {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public Facade(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
