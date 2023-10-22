package command;

import org.junit.Test;

/**
 * ClassName: CommandTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class CommandTest {
    @Test
    public void commandTest(){
        BingReceiver bingReceiver = new BingReceiver();
        ChatGptReceiver chatGptReceiver = new ChatGptReceiver();
        SdReceiver sdReceiver = new SdReceiver();

        Command dialogueCommand = new DialogueCommand(chatGptReceiver);
        Command generatePromptCommand = new GeneratePromptCommand(bingReceiver);
        Command drawCommand = new DrawCommand(sdReceiver);
        Command describeImageCommand = new DescribeImageCommand(bingReceiver);
        AiInvoker aiInvoker = new AiInvoker();

        aiInvoker.addCommand(dialogueCommand);
        aiInvoker.addCommand(generatePromptCommand);
        aiInvoker.addCommand(drawCommand);
        aiInvoker.addCommand(describeImageCommand);

        aiInvoker.execute();

        aiInvoker.clear();
    }
}
