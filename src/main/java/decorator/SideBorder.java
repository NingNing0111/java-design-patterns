package decorator;

/**
 * ClassName: SideBorder <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public class SideBorder extends Border{

    private char borderChar;

    public SideBorder(Display display,char borderChar){
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    int getRows() {
        return display.getRows();
    }

    @Override
    String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
