package state;

/**
 * ClassName: User <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class User implements IUser,ISwitchState{

    private IUser state = new Normal();

    @Override
    public void purchaseVIP() {
        state = new Vip();
    }

    @Override
    public void expire() {
        state = new Normal();
    }

    @Override
    public void skipAds() {
        state.skipAds();
    }
}
