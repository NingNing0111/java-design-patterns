package decorator;

/**
 * ClassName: Border <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display){
        this.display = display;
    }
}
