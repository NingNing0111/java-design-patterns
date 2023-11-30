package adapter;

/**
 * ClassName: PrintBannerAdapterByRely <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public class PrintBannerAdapterByRely extends PrintAbstract{
    private Banner banner;
    public PrintBannerAdapterByRely(String str){
        this.banner = new Banner(str);
    }
    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}
