package prototype;

/**
 * ClassName: UnderSout <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/13 0013
 * @since JDK 11
 */
public class UnderSout implements Product{
    private char ch;
    public UnderSout(char ch){
        this.ch = ch;
    }
    @Override
    public void use(String str) {
        int len = str.length();
        System.out.println(str);
        for(int i=0;i<len;i++){
            System.out.print(this.ch);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }
}
