package command;

/**
 * ClassName: GeneratePromptCommand <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class GeneratePromptCommand implements Command{

    private BingReceiver bingReceiver;
    public GeneratePromptCommand(BingReceiver bingReceiver){
        this.bingReceiver = bingReceiver;
    }

    @Override
    public void execute() {
        bingReceiver.generatePrompt();
    }
}
