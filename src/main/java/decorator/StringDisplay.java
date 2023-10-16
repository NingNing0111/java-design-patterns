package decorator;

/**
 * ClassName: StringDisplay <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/16 0016
 * @since JDK 11
 */
public class StringDisplay extends Display{

    private String string;

    public StringDisplay(String string){
        this.string = string;
    }

    @Override
    int getColumns() {
        return string.length();
    }

    @Override
    int getRows() {
        return 1;
    }

    @Override
    String getRowText(int row) {
        if(row == 0){
            return string;
        }else {
            return null;
        }
    }
}
