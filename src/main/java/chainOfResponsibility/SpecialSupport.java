package chainOfResponsibility;

/**
 * ClassName: SpecialSupport <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class SpecialSupport extends Support{
    private int number;

    public SpecialSupport(String name,int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
