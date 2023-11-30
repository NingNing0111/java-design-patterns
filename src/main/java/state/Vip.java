package state;

/**
 * ClassName: Vip <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class Vip implements IUser{
    @Override
    public void skipAds() {
        System.out.println("尊敬的VIP用户，我们已为您自动跳过了广告！");
    }
}
