package prototype;

/**
 * ClassName: SurroundSout <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/13 0013
 * @since JDK 11
 */
public class SurroundSout implements Product{

    private char ch;

    public SurroundSout(char ch){
        this.ch = ch;
    }

    @Override
    public void use(String str) {
        int len = str.length();
        for(int i=0;i<len+2;i++){
            System.out.print(this.ch);
        }
        System.out.println();
        for (int i=0;i<len+2;i++){
            if(i == 0 || i == len+1){
                System.out.print(this.ch);
            }else{
                System.out.print(str.charAt(i-1));
            }
        }
        System.out.println();
        for(int i=0;i<len+2;i++){
            System.out.print(this.ch);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }
}
