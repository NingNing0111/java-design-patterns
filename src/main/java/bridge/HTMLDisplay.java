package bridge;

/**
 * ClassName: HTMLDisplay <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class HTMLDisplay extends Display{
    public HTMLDisplay(DisplayInterface displayInterface) {
        super(displayInterface);
    }

    public void display(String htmlElement){
        System.out.println("<" + htmlElement + ">");
        display();
        System.out.println("</" + htmlElement + ">");
    }
}
