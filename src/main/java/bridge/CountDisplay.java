package bridge;

/**
 * ClassName: CountDisplay <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayInterface displayInterface) {
        super(displayInterface);
    }

    public void countDisplay(int cnt){
        displayOpen();
        for (int i = 0; i < cnt; i++) {
            displayPrint();
        }
        displayClose();
    }
}
