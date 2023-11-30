package state;

/**
 * ClassName: Normal <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class Normal implements IUser{
    @Override
    public void skipAds() {
        // 普通用户在执行跳过广告时执行的操作
        System.out.println("普通用户不支持跳过广告！");
    }
}
