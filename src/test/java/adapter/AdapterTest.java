package adapter;

import org.junit.Test;

/**
 * ClassName: AdapterTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public class AdapterTest {
    @Test
    public void adapterByExtendTest(){
        Print banner = new PrintBannerAdapterByExtend("Hello");
        banner.printStrong();
        banner.printWeak();
    }

    @Test
    public void adapterByRelyTest(){
        PrintAbstract banner = new PrintBannerAdapterByRely("Hello");
        banner.printStrong();
        banner.printWeak();
    }
}
