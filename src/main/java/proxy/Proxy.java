package proxy;

/**
 * ClassName: Proxy <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/22 0022
 * @since JDK 11
 */
public class Proxy implements Printable{

    private String name;
    Printer real;

    public Proxy(){}

    @Override
    public synchronized void setPrintName(String name) {
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String name) {
        realize(name);
        real.print(name);
    }
    private synchronized void realize(String name){
        if (real == null){
            real = new Printer(name);
        }
    }
}
