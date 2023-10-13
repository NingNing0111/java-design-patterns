package adapter;

/**
 * ClassName: Banner <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public class Banner {
    private String str;
    public Banner(String str){
        this.str = str;
    }

    public void showWithParen(){
        System.out.println("(" + str + ")" + ".This is a method that has been implemented before");
    }

    public void showWithAster(){
        System.out.println("*" + str + "*" + ".This is a method that has been implemented before") ;
    }
}
