package chainOfResponsibility;

/**
 * ClassName: LimitSupport <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class LimitSupport extends Support{

    private int limit;

    public LimitSupport(String name,int limit) {
        super(name);
        this.limit = limit;
    }

    // 当编号小于limit时，这个问题会在当前的Support中被解决
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
