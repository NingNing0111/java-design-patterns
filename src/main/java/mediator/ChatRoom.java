package mediator;

import java.util.Date;

/**
 * ClassName: ChatRoom <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
