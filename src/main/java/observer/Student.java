package observer;

/**
 * ClassName: Student <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class Student implements Observer{
    // 学生姓名
    private String name;
    // 具体的小动作
    private String action;
    public Student(String name,String action){
        this.name = name;
        this.action = action;
    }

    @Override
    public void update(String event, boolean isWrite) {
        System.out.println("观察者：" + name + "------------");
        System.out.println(name+"知道老师正在" + event);
        if(isWrite){
            System.out.println(name + "开始" + action);
        }else{
            System.out.println(name + "开始认真听课！");
        }
    }
}
