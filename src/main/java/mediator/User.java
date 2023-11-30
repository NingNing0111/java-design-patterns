package mediator;

/**
 * ClassName: User <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
