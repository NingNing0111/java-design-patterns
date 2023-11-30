package chainOfResponsibility;

/**
 * ClassName: Trouble <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class Trouble {
    private int number;
    public Trouble(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public String toString(){
        return "[Trouble " + number + "]";
    }
}
