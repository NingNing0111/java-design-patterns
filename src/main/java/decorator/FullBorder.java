package decorator;

/**
 * ClassName: FullBorder <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public class FullBorder extends Border{

    public FullBorder(Display display){
        super(display);
    }

    @Override
    int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    String getRowText(int row) {
        if (row == 0){
            return "+" + makeLine('-',display.getColumns()) + "+";
        }else if (row == display.getRows() + 1){
            return "+" + makeLine('-',display.getColumns()) + "+";
        }else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch,int count){
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
