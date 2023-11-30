package command;

/**
 * ClassName: DialogueCommand <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class DialogueCommand implements Command{
    private ChatGptReceiver chatGpt;

    @Override
    public void execute() {
        chatGpt.dialogue();
    }

    public DialogueCommand(ChatGptReceiver chatGpt){
        this.chatGpt = chatGpt;
    }
}
