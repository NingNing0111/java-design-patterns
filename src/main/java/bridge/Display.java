package bridge;

/**
 * ClassName: Display <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public abstract class Display {
    private DisplayInterface displayInterface;
    public Display(DisplayInterface displayInterface){
        this.displayInterface = displayInterface;
    }
    public void displayOpen(){
        displayInterface.open();
    }
    public void displayPrint(){
        displayInterface.print();
    }
    public void displayClose(){
        displayInterface.close();
    }
    public final void display(){
        displayOpen();
        displayPrint();
        displayClose();
    }
}
