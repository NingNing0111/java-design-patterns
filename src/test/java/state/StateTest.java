package state;

import org.junit.Test;

/**
 * ClassName: StateTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class StateTest {
    @Test
    public void stateTest(){
        // 创建一个用户
        User user = new User();
        // 该用户执行跳过广告的操作
        user.skipAds();
        // 该用户选择升级为VIP
        user.purchaseVIP();
        // 该用户再次执行跳过广告的操作
        user.skipAds();
        // 该用户的VIP过期了
        user.expire();
        // 该用户还想执行跳过广告的操作
        user.skipAds();
    }
}

