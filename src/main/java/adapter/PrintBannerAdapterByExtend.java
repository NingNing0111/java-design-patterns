package adapter;

/**
 * ClassName: PrintBannerAdapterByExtend <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public class PrintBannerAdapterByExtend extends Banner implements Print{

    public PrintBannerAdapterByExtend(String str){
        super(str);
    }

    @Override
    public void printWeak() {
        // 在实现Print接口中声明的printWeak时，我们就可以直接调用通过继承Banner类得到的showWithParen()方法从而实现接口适配
        showWithParen();
    }

    @Override
    public void printStrong() {
        // 在实现Print接口中声明的printStrong时，我们就可以直接调用通过继承Banner类得到的showWithAster()方法从而实现接口适配
        showWithAster();
    }
}
