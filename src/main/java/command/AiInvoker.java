package command;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: AiInvoker <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class AiInvoker {
    private List<Command> commandList = new ArrayList<>();
    public void addCommand(Command command){
        commandList.add(command);
    }
    public void execute(){
        commandList.forEach(Command::execute);
    }
    public void clear(){
        commandList.clear();
    }
}
