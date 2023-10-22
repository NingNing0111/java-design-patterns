package command;

/**
 * ClassName: DrawCommand <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class DrawCommand implements Command{

    private SdReceiver sdReceiver;
    public DrawCommand(SdReceiver sdReceiver){
        this.sdReceiver = sdReceiver;
    }

    @Override
    public void execute() {
        sdReceiver.draw();
    }
}
