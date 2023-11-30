package proxy;

/**
 * ClassName: Printer <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class Printer implements Printable{

    private String name;

    public Printer(String name){
        heavyJob("生成实例对象" + name + "中.");
        this.name = name;
    }

    @Override
    public void setPrintName(String name) {
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String name) {
        System.out.println("===" + name + "===");
        System.out.println(name);
    }

    private void heavyJob(String msg){
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);
                System.out.println(".");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("结束");
    }
}
