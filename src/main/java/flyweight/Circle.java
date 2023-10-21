package flyweight;

/**
 * ClassName: Circle <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class Circle implements IShape{

    private double radius;
    private String color;

    public Circle(String color){
        this.color = color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("绘制了一个半径为：" + radius + ",颜色为：" + color + "的圆.");
    }
}
