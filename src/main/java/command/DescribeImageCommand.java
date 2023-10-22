package command;

/**
 * ClassName: DescribeImageCommand <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class DescribeImageCommand implements Command{
    private BingReceiver bingReceiver;
    public DescribeImageCommand(BingReceiver bingReceiver){
        this.bingReceiver = bingReceiver;
    }
    @Override
    public void execute() {
        bingReceiver.describeImage();
    }
}
